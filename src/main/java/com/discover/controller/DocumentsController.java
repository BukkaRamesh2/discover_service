package com.discover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.discover.entity.Documents;
import com.discover.service.DocumentsService;

import jakarta.websocket.server.PathParam;

public class DocumentsController {
	@Autowired
	DocumentsService DctsService  ;
	
	
	@PostMapping("/addDocuments")
	public Documents addDocuments(@RequestBody Documents Documents){
		return DctsService.addDocuments(Documents);
		
	}
	
	@GetMapping("/getDocuments/{DocumentsID}")
	public Documents getDocuments(@PathParam("DocumentsID") Long DocumentsID){
		return DctsService.getDocuments(DocumentsID);
	}
	
	@GetMapping("/getAllDocuments")
	public List<Documents> getAllDocuments(){
		return DctsService.getAllDocuments();
	}
	
	@PutMapping("/updateDocuments")
	public Documents updateDocuments(@RequestBody Documents Documents){
		return DctsService.updateDocuments(Documents);
	}
	
	@DeleteMapping("/deleteDocuments/{DocumentsID}")
	public void deleteDocuments(@PathParam("DocumentsID") Long DocumentsID){
		
	}
	

}
