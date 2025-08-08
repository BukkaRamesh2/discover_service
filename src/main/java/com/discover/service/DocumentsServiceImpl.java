package com.discover.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ObjectOptimisticLockingFailureException;
import org.springframework.stereotype.Service;

import com.discover.entity.Documents;
import com.discover.exception.DocumentsNotFoundException;
import com.discover.repository.DocumentsRepository;

import jakarta.transaction.Transactional;

@Service
public class DocumentsServiceImpl implements DocumentsService{
	
	private final Map<Long, Documents> DocumentsStore =  new HashMap();
	
	@Autowired
	DocumentsRepository docRepo;
    
	@Transactional
	@Override
	public Documents addDocuments(Documents documents) {
        if (documents.getDocumentid() != null || documents.getVersion() != null) {
            throw new IllegalArgumentException("No ID/version allowed when creating");
        }
		return docRepo.save(documents);
	}
    
    @Transactional
	@Override
	public Documents updateDocuments(Documents documents) {
        if (documents.getDocumentid() == null || documents.getVersion() == null) {
            throw new IllegalArgumentException("ID and version required for update");
        }

        Documents existing = docRepo.findById(documents.getDocumentid())
            .orElseThrow(() -> new DocumentsNotFoundException("Documents Id " + documents.getDocumentid() + " not found"));

        if (!existing.getVersion().equals(documents.getVersion())) {
            throw new ObjectOptimisticLockingFailureException(Documents.class, documents.getDocumentid());
        }

        BeanUtils.copyProperties(documents, existing, "id", "version");
        return docRepo.save(existing);
    }

	@Override
	public Documents getDocuments(Long id) {
        return docRepo.findById(id)
            .orElseThrow(() -> new DocumentsNotFoundException("Documents Id " + id + " not found"));
    }

   @Override
     public List<Documents> getAllDocuments() {
        return docRepo.findAll();
    }

	@Override
	public void deleteDocuments(Long id) {
	    if (!docRepo.existsById(id)) {
	        throw new DocumentsNotFoundException("Documents Id " + id + " not found");
	    }
	    docRepo.deleteById(id);
	}

	

	

	

}