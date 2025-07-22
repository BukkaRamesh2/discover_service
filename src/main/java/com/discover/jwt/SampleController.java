package com.discover.jwt;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Tag(name = "Sample API", description = "Sample protected endpoints")
@SecurityRequirement(name = "bearerAuth")
public class SampleController {

    @GetMapping("/profile")
    @Operation(summary = "Get user profile", description = "Get authenticated user's profile")
    public ResponseEntity<?> getUserProfile() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        
        Map<String, Object> profile = new HashMap<>();
        profile.put("username", username);
        profile.put("message", "This is a protected endpoint");
        profile.put("timestamp", System.currentTimeMillis());
        
        return ResponseEntity.ok(profile);
    }

    @GetMapping("/public")
    @Operation(summary = "Public endpoint", description = "This endpoint doesn't require authentication")
    public ResponseEntity<?> getPublicData() {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "This is public data");
        data.put("timestamp", System.currentTimeMillis());
        
        return ResponseEntity.ok(data);
    }
}
