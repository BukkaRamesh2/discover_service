package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.entity.Documents;
import com.discover.service.DocumentsService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/documents")
@Tag(name = "Documents API", description = "Operations related to Documents")
@SecurityRequirement(name = "bearerAuth") 
public class DocumentsController {
	@Autowired
	DocumentsService DctsService  ;
	
	
	@PostMapping("/addDocuments")
	@Operation(summary = "Create Documents")
    public ResponseEntity<Documents> createDocuments(@RequestBody Documents documents) {
        Documents saved = DctsService.addDocuments(documents);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
	
		
	}
	
	@GetMapping("/getDocuments/{documentid}")
	@Operation(summary = "Get Documents by ID")
	public ResponseEntity<Documents> getDocumentsById(@PathParam("documentid") Long id) {
        Documents documents = DctsService.getDocuments(id);
        return ResponseEntity.ok(documents);
	
	}
	
	@GetMapping("/getAllDocuments")
	@Operation(summary = "Get all Documents")
	public List<Documents> getAllDocuments(){
		return DctsService.getAllDocuments();
	}
	
	@PutMapping("/updateDocuments")
	 @Operation(summary = "Update Documents")
    public ResponseEntity<Documents> update(@RequestBody Documents documents) {
        Documents updated = DctsService.updateDocuments(documents);
        return ResponseEntity.ok(updated);
	
	}
	
	@DeleteMapping("/deleteDocuments/{documentid}")
	@Operation(summary = "Delete Documents by ID")
    public ResponseEntity<Void> deleteDocuments(@PathParam("documentid") Long DocumentsID) {
        DctsService.deleteDocuments(DocumentsID);
        return ResponseEntity.noContent().build();
	
		
	}
	

}
