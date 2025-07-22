package com.discover.service;

import java.util.List;

import com.discover.entity.Documents;

public interface DocumentsService {
	
	public Documents addDocuments(Documents doc); //you can define method with body 

	public Documents getDocuments(Long Id); //you can define method with body 

	public List<Documents> getAllDocuments();

	public Documents updateDocuments(Documents doc);

	public void deleteDocuments(Long documentsID);
		
	   
}