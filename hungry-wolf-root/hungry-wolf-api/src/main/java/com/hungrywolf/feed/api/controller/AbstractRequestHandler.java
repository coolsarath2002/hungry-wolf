package com.hungrywolf.feed.api.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import com.hungrywolf.feed.api.exception.HungryWolfAPIException;
import com.hungrywolf.feed.api.exception.ValidationException;
import com.hungrywolf.feed.api.model.APIResponse;
import org.springframework.http.HttpStatus;
public abstract class AbstractRequestHandler implements ApplicationEventPublisherAware {

	//protected final Logger LOGGER = Logger.getLogger(this.getClass());
	protected ApplicationEventPublisher eventPublisher;

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ValidationException.class)
	@ResponseBody
	public APIResponse<Object> handleValidationException(ValidationException validExcep, WebRequest request,
			HttpServletResponse response) {
		//LOGGER.info("Exception on Validation Excpetion ");
		return null;
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(HungryWolfAPIException.class)
	@ResponseBody
	public APIResponse<Object> handleHungryWolfAPIException(HungryWolfAPIException validExcep, WebRequest request,
			HttpServletResponse response) {
		//LOGGER.info("Exception on API ");
		return null;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}
}
