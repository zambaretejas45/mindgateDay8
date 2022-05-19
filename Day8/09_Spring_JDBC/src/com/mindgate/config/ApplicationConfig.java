package com.mindgate.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.mindgate")
@PropertySource("classpath:dbconnection.properties")
public class ApplicationConfig {
	@Autowired
	Environment environment;
	@Bean
	DataSource dataSource() {
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));
		driverManagerDataSource.setUsername(environment.getProperty("user"));
		driverManagerDataSource.setPassword(environment.getProperty("password"));
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		
		return driverManagerDataSource;
	
	}
	
}
