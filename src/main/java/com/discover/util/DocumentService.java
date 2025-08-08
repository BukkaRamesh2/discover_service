package com.discover.util;

import com.discover.entity.Documents;

public abstract class DocumentService {
	

	public abstract void validateDocument(Documents doc);

		public void printDocumentInfo(Documents doc) {
			System.out.println("Document ID: " + doc.getDocumentid());
			System.out.println("Type: " + doc.getDocumenttype());
		}
	}



