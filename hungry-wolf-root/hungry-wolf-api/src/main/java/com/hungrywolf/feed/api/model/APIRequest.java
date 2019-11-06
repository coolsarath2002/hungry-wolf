package com.hungrywolf.feed.api.model;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;

public class APIRequest {
	
	private static final Logger logger = Logger.getLogger(APIRequest.class.getName());
	private InputStream body;
	private List<RequestHeader> requestHeader = new LinkedList<RequestHeader>();
	private Map<String, String> requestProperties = new HashMap<String, String>();
	private Map<String, Object> responseProperties = new HashMap<String, Object>();
	private Object requestObject;
	private String jsonResponse; 
	private ResponseEntity<byte[]> streamResponse;
	
	public Object getRequestObject() {
		return requestObject;
	}

	public void setRequestObject(Object requestObject) {
		this.requestObject = requestObject;
	}

	public InputStream getBody() {
		return body;
	}

	public void setBody(InputStream body) {
		this.body = body;
	}

	public List<RequestHeader> getRequestHeader() {
		return requestHeader;
	}

	public void setRequestHeader(List<RequestHeader> requestHeader) {
		this.requestHeader = requestHeader;
	}

	public Map<String, Object> getResponseProperties() {
		return responseProperties;
	}

	public Map<String, String> getRequestProperties() {
		return requestProperties;
	}

	public void setRequestProperties(Map<String, String> requestProperties) {
		this.requestProperties = requestProperties;
	}
	
	public void addRequestProperties(String key, String value) {
		if(this.requestProperties != null) {
			this.requestProperties.put(key, value);
		}
	}

	public void setResponseProperties(Map<String, Object> responseProperties) {
		this.responseProperties = responseProperties;
	}

	public String getJsonResponse() {
		return jsonResponse;
	}

	public void setJsonResponse(String jsonResponse) {
		this.jsonResponse = jsonResponse;
	}

	public ResponseEntity<byte[]> getStreamResponse() {
		return streamResponse;
	}

	public void setStreamResponse(ResponseEntity<byte[]> streamResponse) {
		this.streamResponse = streamResponse;
	}
	
	public final class RequestHeader {
		private final String key;
		private final String value;
		
		public RequestHeader(String key,String value){
			this.key=key;
			this.value=value;
		}
		
		public String getKey() {
			return key;
		}
		
		public String getValue() {
			return value;
		}
	}

	

}