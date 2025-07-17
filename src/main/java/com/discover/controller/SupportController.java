package com.discover.controller;

import com.discover.entity.Support;
import com.discover.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/support")
public class SupportController {

    @Autowired
    private SupportService supportService;

    @PostMapping("/save")
    public Support save(@RequestBody Support support) { // Add @RequestBody
        return supportService.save(support);
    }

    @PutMapping("/update/{id}")
    public Support update(@PathVariable Long id, @RequestBody Support support) {
        support.setSupportId(id); // Ensure ID matches path
        return supportService.save(support);
    }

    @GetMapping("/getById/{id}")
    public Support getById(@PathVariable Long id) {
        return supportService.getById(id);
    }

    @GetMapping("/getAll")
    public List<Support> getAllSupports() {
        return supportService.getAllSupports();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        supportService.delete(id);
    }
}