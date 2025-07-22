/*package com.discover.jwt;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    public final PasswordEncoder passwordEncoder;
    private final Map<String, String> users = new HashMap<>();

    public CustomUserDetailsService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        // Initialize with some test users - replace with database lookup in production
        users.put("admin", passwordEncoder.encode("password"));
        users.put("user", passwordEncoder.encode("password"));
        
        // Debug: Print encoded passwords
        System.out.println("Admin encoded password: " + users.get("admin"));
        System.out.println("User encoded password: " + users.get("user"));
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = users.get(username);
        if (password == null) {
            throw new UsernameNotFoundException("User not found: " + username);
        }
        return new User(username, password, new ArrayList<>());
    }

    public boolean authenticateUser(String username, String password) {
        System.out.println("Attempting to authenticate user: " + username);
        String storedPassword = users.get(username);
        if (storedPassword == null) {
            System.out.println("User not found: " + username);
            return false;
        }
        
        boolean matches = passwordEncoder.matches(password, storedPassword);
        System.out.println("Password matches: " + matches);
        System.out.println("Input password: " + password);
        System.out.println("Stored password hash: " + storedPassword);
        
        return matches;
    }
}
*/