package com.discover.util;

import java.util.*;

import com.discover.entity.Documents;

public class TestDocuments {
	public static void main(String[] args) {
        
		Documents doc = new Documents(101,"Passport",2020,"Unknown",2024);
	    Documents doc1 = new Documents(102,"licience",2021,"Unknown",2025);
	    Documents doc2 = new Documents(103,"Pan",2022,"Unknown",2026);
	        
        
        System.out.println("Document is created");
        System.out.println();
        System.out.println();
        DocumentImplementation docImpl = new DocumentImplementation();

       
        docImpl.validateDocument(doc);

       
        System.out.println("Document Status: " + doc.getStatus());

        System.out.println("\n--- Using overloaded method with printDetails = true ---");
        System.out.println();
        docImpl.validateDocument(doc, true);
        System.out.println();
        
        
        for (int i = 1; i <= 3; i++) {
            doc.setDocumentid(100 + i);
            doc.setDocumenttype("Passport");
            doc.setIssuedate(2020);
            doc.setExpirydate(2023 + i); // Changing expiry year
            doc.setStatus("Unknown");

            System.out.println("Validation Round: " + i);
            docImpl.validateDocument(doc);
            System.out.println("Document ID: " + doc.getDocumentid());
            System.out.println("Status: " + doc.getStatus());
            System.out.println("------------------------");
        }
       
        System.out.println("\n---  Implementation of ArrayList ---");
        //implementation of ArrayList
        List<Documents> documentList = new ArrayList();
        documentList.add(doc);
        documentList.add(doc1);
        documentList.add(doc2);

       
        for (Documents d : documentList) {
            System.out.println(d);
            }
        System.out.println("------------------------");
    
        System.out.println("\n--- Implementation of TreeMap  ---");
        
        //implementation of TreeMap
        Map<String, Documents> documentMap = new TreeMap<>();
        documentMap.put(doc.getDocumenttype(), doc);
        documentMap.put(doc1.getDocumenttype(), doc1);
        documentMap.put(doc2.getDocumenttype(), doc2);

       
        for (Map.Entry<String, Documents> entry : documentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " -> Value: " + entry.getValue());
        }
        System.out.println("------------------------");
        System.out.println("\n--- implementation of LinkedHashset ---");
        //implementation of LinkedHashset
        Set<Documents> documentSet = new LinkedHashSet<>();
        documentSet.add(doc);
        documentSet.add(doc1);
        documentSet.add(doc2);

        // Use while loop with iterator
        Iterator<Documents> iterator = documentSet.iterator();
        while (iterator.hasNext()) {
            Documents d = iterator.next();
            System.out.println(d);
        }
        
        System.out.println("------------------------");
    }

	}
