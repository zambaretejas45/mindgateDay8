package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDetails;

@Configuration
@ComponentScan("com.mindgate.pojo")
public class FinancialYearConfig {
	
	@Bean
	public FinancialYearDetails financialYearDetails () {
		FinancialYearDetails financialYearDetails=new FinancialYearDetails();
		return financialYearDetails;
	}
	@Bean
	public MonthDetails monDetails() {
		MonthDetails monthDetails = new MonthDetails();
		FinancialYearDetails financialYearDetails=new FinancialYearDetails();
		monthDetails.setFinancialYearDetails(financialYearDetails);
		return monthDetails;
	}
}
