package com.discover.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.discover.entity.Documents;
import com.discover.repository.DocumentsRepository;

@Service
public class DocumentsServiceImpl implements DocumentsService{
	
	@Autowired
	DocumentsRepository docRepo;

	@Override
	public Documents addDocuments(Documents documents) {
		// TODO Auto-generated method stub
		// anthing 
		return docRepo.save(documents);
	}

	@Override
	public Documents getDocuments(Long Id) {
		// TODO Auto-generated method stub
		return docRepo.getById(Id);
	}

	@Override
	public List<Documents> getAllDocuments() {
		// TODO Auto-generated method stub
		return docRepo.findAll();
	}

	@Override
	public Documents updateDocuments(Documents Documents) {
		// TODO Auto-generated method stub
		return docRepo.save(Documents);
	}

	

}