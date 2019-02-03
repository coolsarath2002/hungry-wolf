package com.hungrywolf.feed.api.validator;


import java.util.Iterator;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.main.JsonSchema;
import com.github.fge.jsonschema.main.JsonSchemaFactory;
import com.github.fge.jsonschema.report.ProcessingMessage;
import com.github.fge.jsonschema.report.ProcessingReport;
import com.github.fge.jsonschema.util.JsonLoader;
import com.hungrywolf.feed.api.utils.ResourceUtils;

@Component("jsonRequestValidator")
public class JSONRequestValidator implements RequestValidator{

	@Override
	public APIRequestValidationReport validate(String payload, String schemaPath) {
		JsonNode jsonNode = null;
		APIRequestValidationReport report = new APIRequestValidationReport(); 
		try{
			jsonNode = JsonLoader.fromString(payload);
			final JsonSchemaFactory factory = JsonSchemaFactory.byDefault();
			JsonNode schemaNode = ResourceUtils.loadResource(schemaPath);
			JsonSchema schema = factory.getJsonSchema(schemaNode);
			ProcessingReport processReport = schema.validate(jsonNode);
		}catch(Exception ex){
			
		}
		return null;
	}

	public APIRequestValidationReport generateReport(ProcessingReport report) {
		APIRequestValidationReport apiValidationReport = new APIRequestValidationReport();
		if(!report.isSuccess()){
			apiValidationReport.setValidRequest(report.isSuccess());
			Iterator<ProcessingMessage> errorMessage =  report.iterator();
			while(errorMessage.hasNext()){
				ProcessingMessage msg = errorMessage.next();
				JsonNode jNode = msg.asJson();
				//apiValidationReport.add
			}
		}
		return apiValidationReport;
	}

	

}
