package com.discover.controller;

import com.discover.entity.Support;
import com.discover.service.SupportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for handling Support-related API endpoints.
 */
@RestController
@RequestMapping("/api/support")
public class SupportController {

    private final SupportService supportService;

    @Autowired
    public SupportController(SupportService supportService) {
        this.supportService = supportService;
    }

    /**
     * Creates and stores a new support entry.
     *
     * @param support the support object to be saved
     * @return the persisted Support object
     */
    @PostMapping("/create")
    public Support createSupport(@RequestBody Support support) {
        return supportService.save(support);
    }

    /**
     * Updates an existing support entry by its ID.
     *
     * @param id      the ID of the support entry to update
     * @param support the updated support data
     * @return the updated Support object
     */
    @PutMapping("/edit/{id}")
    public Support modifySupport(@PathVariable("id") Long id, @RequestBody Support support) {
        support.setSupportId(id);
        return supportService.save(support);
    }

    /**
     * Retrieves a support entry using its ID.
     *
     * @param id the support entry's ID
     * @return the Support object with the given ID
     */
    @GetMapping("/{id}")
    public Support fetchSupportById(@PathVariable("id") Long id) {
        return supportService.getById(id);
    }

    /**
     * Returns a list of all support entries.
     *
     * @return list of Support objects
     */
    @GetMapping("/all")
    public List<Support> listAllSupports() {
        return supportService.getAllSupports();
    }

    /**
     * Deletes a support entry by ID.
     
     */
    @DeleteMapping("/remove/{id}")
    public void removeSupport(@PathVariable("id") Long id) {
        supportService.delete(id);
    }
}
