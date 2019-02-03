package com.hungrywolf.feed.api.model;


public class APIRequestMessage {
	
	private String rawMessage;
	private String node;
	private String severity;
	private String message;
	private String exceptionMessage;
	
	public APIRequestMessage(String rawMessage){
		this.rawMessage=rawMessage;
	}
	
	public APIRequestMessage(String node,String severity,String message){
		this.node=node;
		this.severity=severity;
		this.message=message;
	}

	public String getRawMessage() {
		return rawMessage;
	}

	public void setRawMessage(String rawMessage) {
		this.rawMessage = rawMessage;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

}
