package com.hungrywolf.feed.api.validator;

import com.github.fge.jsonschema.report.ProcessingReport;

public interface RequestValidator {

	public APIRequestValidationReport validate(String payload,String schema);
	public APIRequestValidationReport generateReport(ProcessingReport report);

}
