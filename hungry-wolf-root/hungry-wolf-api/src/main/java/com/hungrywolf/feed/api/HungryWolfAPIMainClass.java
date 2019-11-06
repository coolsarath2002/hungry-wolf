package com.hungrywolf.feed.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@Configuration
@SpringBootApplication
@ComponentScan(basePackages = "com.hungrywolf")
@EnableScheduling
@EnableAsync
/*@PropertySources({
		@PropertySource("classpath:application.properties"),
		@PropertySource("classpath:query.properties")
})*/
public class HungryWolfAPIMainClass extends SpringBootServletInitializer
{
	public static void main(String[] args) {
		SpringApplication.run(HungryWolfAPIMainClass.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HungryWolfAPIMainClass.class);
	}
}
