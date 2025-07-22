package com.discover.controller;

import com.discover.entity.Support;
import com.discover.service.SupportService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/support")
@Tag(name = "Customer API", description = "Operations related to customers")
@SecurityRequirement(name = "bearerAuth") // This applies JWT auth to all endpoints in this controller
public class SupportController {

    @Autowired
    private SupportService supportService;

    private String getCurrentUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication != null ? authentication.getName() : "Srinath";
    }
    
    
    @PostMapping("/save")
    @Operation(summary = "Create support")
    public ResponseEntity<Support> save(@RequestBody Support support) { // Add @RequestBody
        Support saved = supportService.save(support);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    @Operation(summary = "Update support")
    public ResponseEntity<Support> update(@PathVariable Long id, @RequestBody Support support) {
        support.setSupportId(id); // Ensure ID matches path
        Support updated = supportService.updateSupport(support);
        return ResponseEntity.ok(updated);
    }

    @GetMapping("/getById/{id}")
    @Operation(summary = "Get support by ID")
    public ResponseEntity<Support> getById(@PathVariable Long id) {
        Support support = supportService.getById(id);
        return ResponseEntity.ok(support);
    }

    @GetMapping("/getAll")
    @Operation(summary = "Get all support")
    public ResponseEntity<List<Support>> getAllSupports() {
        return ResponseEntity.ok(supportService.getAllSupports());
    }

    @DeleteMapping("/delete/{id}")
    @Operation(summary = "Delete support by ID")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        supportService.delete(id);
        return ResponseEntity.noContent().build();
    }
}