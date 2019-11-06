package com.hungrywolf.feed.api.config;


import java.util.Arrays;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.hungrywolf.feed.api.utils.Constants;
import com.hungrywolf.feed.api.validator.LoggingRequestInterceptor;




@Configuration
public class APIApplicationConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/**
	 * Gets the value of the given property from the environment variables, or the system properties, in that order.
	 *
	 * @param propertyName
	 * @return value of property as a String
	 * @throws IllegalStateException if property not found in either place
	 */
	public static String getEnv(String propertyName) {
		String value = System.getenv(propertyName);
		if (value == null) {
			value = System.getProperty(propertyName);
			if (value == null) {
				throw new IllegalStateException("Missing required property: " + propertyName);
			}
		}
		return value;
	}

	/**
	 * Same as getEnv(), but the property is assumed to be an Integer
	 */
	public static Integer getIntEnv(String propertyName) {
		return Integer.valueOf(getEnv(propertyName));
	}

	@Bean
	public CacheManager cacheManager() {
		SimpleCacheManager cacheManager = new SimpleCacheManager();
		cacheManager.setCaches(Arrays.asList(
				new ConcurrentMapCache(Constants.Cache.API_PROPERTIES_CACHE_NAME)));
		return cacheManager;
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder
				.additionalMessageConverters(new MappingJackson2HttpMessageConverter())
				.additionalMessageConverters(new StringHttpMessageConverter())
				.interceptors(new LoggingRequestInterceptor())
				//.errorHandler(new ClientHttpErrorHandler("FeedAPI"))
				.build();
	}
}
