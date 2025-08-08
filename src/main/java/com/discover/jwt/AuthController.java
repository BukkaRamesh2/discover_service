package com.discover.jwt;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@Tag(name = "Authentication", description = "Authentication management APIs")
public class AuthController {

    @Autowired   // inject a bean 
    private JwtUtil jwtUtil;

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @PostMapping("/login")
    @Operation(summary = "User login", description = "Authenticate user and return JWT token")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        try {
            System.out.println("Login attempt for user: " + loginRequest.getUsername());
            
            // Validate input
            if (loginRequest.getUsername() == null || loginRequest.getPassword() == null) {
                return ResponseEntity.badRequest().body("Username and password are required");
            }
            
            // Authenticate user
            if (userDetailsService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword())) {
                UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.getUsername());
                String token = jwtUtil.generateToken(userDetails);
                
                Map<String, String> response = new HashMap<>();
                response.put("token", token);
                response.put("username", loginRequest.getUsername());
                response.put("message", "Login successful");
                
                System.out.println("Login successful for user: " + loginRequest.getUsername());
                return ResponseEntity.ok(response);
            } else {
                System.out.println("Invalid credentials for user: " + loginRequest.getUsername());
                Map<String, String> errorResponse = new HashMap<>();
                errorResponse.put("error", "Invalid credentials");
                return ResponseEntity.status(401).body(errorResponse);
            }
        } catch (Exception e) {
            System.out.println("Authentication failed with exception: " + e.getMessage());
            e.printStackTrace();
            Map<String, String> errorResponse = new HashMap<>();
            errorResponse.put("error", "Authentication failed: " + e.getMessage());
            return ResponseEntity.status(500).body(errorResponse);
        }
    }

    // Inner class for login request
    public static class LoginRequest {
        private String username;
        private String password;

        // Constructors
        public LoginRequest() {}

        public LoginRequest(String username, String password) {
            this.username = username;
            this.password = password;
        }

        // Getters and setters
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}