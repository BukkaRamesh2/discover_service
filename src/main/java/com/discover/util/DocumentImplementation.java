//package com.discover.util;
//
//import com.discover.entity.Documents;
//
//public class DocumentImplementation extends DocumentService{
//	// Method Overriding
//		@Override
//		public void validateDocument(Documents doc) {
//			if (doc.getExpirydate() < 2025) {
//				doc.setStatus("Expired");
//			} else {
//				doc.setStatus("Valid");
//			}
//
//			// Switch example
//			switch (doc.getDocumenttype().toLowerCase()) {
//				case "passport":
//					System.out.println("Passport validation complete.");
//					break;
//				case "license":
//					System.out.println("License validation complete.");
//					break;
//				default:
//					System.out.println("Unknown document type.");
//			}
//		}
//
//		// Method Overloading
//		public void validateDocument(Documents doc, boolean printDetails) {
//			validateDocument(doc);
//			if (printDetails) {
//				printDocumentInfo(doc);
//			}
//		}
//
//
//}
