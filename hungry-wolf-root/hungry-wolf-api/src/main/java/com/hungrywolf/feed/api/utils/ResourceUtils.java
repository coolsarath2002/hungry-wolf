package com.hungrywolf.feed.api.utils;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jsonschema.util.JsonLoader;

public final class ResourceUtils {

	private static final String BASEPACKAGE;
	
	static{
		final String packageName=ResourceUtils.class.getPackage().getName();
		BASEPACKAGE='/' + packageName.replace(".", "/");
	}
	
	private ResourceUtils(){
		
	}
	
	public static JsonNode loadResource(final String name) throws IOException{
		return JsonLoader.fromResource(BASEPACKAGE+name);
	}
}