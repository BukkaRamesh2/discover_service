package com.discover.service;

import java.util.Map;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.lambda.AWSLambda;
import com.amazonaws.services.lambda.AWSLambdaClientBuilder;
import com.amazonaws.services.lambda.model.InvokeRequest;
import com.amazonaws.services.lambda.model.InvokeResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LambdaInvokeService {
	
	
	private final AWSLambda awsLambda;
	
	public LambdaInvokeService() {
		this.awsLambda = AWSLambdaClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
	}
	
	public String invokeLambda(Map<String, Object> input) throws JsonProcessingException {
		
		
		 ObjectMapper mapper = new ObjectMapper();
		 
		 InvokeRequest request = new InvokeRequest().withFunctionName("DISCValidateDocLambda")
				 .withPayload(mapper.writeValueAsString(input));
		 
		 InvokeResult result = awsLambda.invoke(request);
		 
		 return new String(result.getPayload().array());
		 
	}

}
