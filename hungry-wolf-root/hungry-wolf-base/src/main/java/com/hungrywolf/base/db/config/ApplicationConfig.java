package com.hungrywolf.base.db.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;



@Configuration
public class ApplicationConfig {

	/*@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}*/

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
	@Qualifier("woodsDataSource")
	public DataSource dataSource() {
		return ConnectionFactory.getDatasource();
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(dataSource());
		return transactionManager;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate() {
		return new NamedParameterJdbcTemplate(dataSource());
	}

	
	
}
