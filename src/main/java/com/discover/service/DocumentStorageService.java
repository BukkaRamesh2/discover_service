//package com.discover.service;
//
//import java.io.IOException;
//import java.util.UUID;
//
//import org.springframework.web.multipart.MultipartFile;
//
//import com.amazonaws.AmazonServiceException;
//import com.amazonaws.SdkClientException;
//import com.amazonaws.auth.AWSCredentials;
//import com.amazonaws.regions.Regions;
//import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3Builder;
//import com.amazonaws.services.s3.AmazonS3ClientBuilder;
//import com.amazonaws.services.s3.model.ObjectMetadata;
//import com.amazonaws.services.s3.model.Region;
//
//
//
///**
// * 
// */
//public class DocumentStorageService {
//	
//	//private final AmazonS3 s3Client;
//	
//	
//	String accessKey = "<AWS Access Key>";
//	String secretKey = "<AWS Secret Key>";
//	String regionName = "<AWS Region>";
//	
//	AWSCredentials credentials = AwsBasicCredentials.create(accessKey, secretKey);
//	
//	public DocumentStorageService() {
//		this.s3Client = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
//		
//		S3Client s3Client = S3Client
//				  .builder()
//				  .region(Region.of(regionName))
//				  .credentialsProvider(StaticCredentialsProvider.create(credentials))
//				  .build();
//	}
//	
//
//	
//	public String uploadFile(MultipartFile file) throws IOException, AmazonServiceException, SdkClientException {
//		
//		String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
//		ObjectMetadata metadata = new ObjectMetadata();
//		metadata.setContentLength(file.getSize());
//		s3Client.putObject("discover-docs-bucket", fileName, file.getInputStream(), metadata);
//		
//		
//		return fileName;
//	}
//}