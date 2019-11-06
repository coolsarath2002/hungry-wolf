package com.hungrywolf.base.db.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import static com.hungrywolf.base.db.config.ApplicationConfig.*;
import static com.hungrywolf.base.db.helper.Constants.JDBC_DRIVER;
import static com.hungrywolf.base.db.helper.Constants.JDBC_MAX_ACTIVE_CONNECTIONS;
import static com.hungrywolf.base.db.helper.Constants.JDBC_MAX_CHECKOUT_TIME;
import static com.hungrywolf.base.db.helper.Constants.JDBC_MAX_IDLE_CONNECTIONS;
import static com.hungrywolf.base.db.helper.Constants.JDBC_URL;
import static com.hungrywolf.base.db.helper.Constants.JDBC_USERNAME;
import static com.hungrywolf.base.db.helper.Constants.JDBC_PASSWORD;

;

/**
 * Created by msvoboda on 2/2/17.
 */
public class ConnectionFactory {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConnectionFactory.class);
	private final DataSource dataSource;

	private ConnectionFactory() {
		this.dataSource = makeDatasource();
	}

	public static DataSource getDatasource() {
		return Singleton.INSTANCE.dataSource;
	}

	private static DataSource makeDatasource() {
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		try {
			cpds.setDriverClass(getEnv(JDBC_DRIVER));
		} catch (PropertyVetoException e) {
			throw new RuntimeException(e);
		}

		cpds.setJdbcUrl(getEnv(JDBC_URL)+"&ssl=allow&sslfactory=org.postgresql.ssl.NonValidatingFactory");
		cpds.setUser(getEnv(JDBC_USERNAME));
		cpds.setPassword(getEnv(JDBC_PASSWORD));
		cpds.setAcquireRetryAttempts(1);
		cpds.setMinPoolSize(1);
		cpds.setAcquireIncrement(5);
		cpds.setMaxPoolSize(getIntEnv(JDBC_MAX_ACTIVE_CONNECTIONS));

		return cpds;
	}

	public static DataSource getDatabaseConnection() throws SQLException {
		return Singleton.INSTANCE.dataSource;
	}

	private interface Singleton {
		ConnectionFactory INSTANCE = new ConnectionFactory();
	}

}
