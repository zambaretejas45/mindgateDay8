package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.FinancialYearConfig;
import com.mindgate.pojo.MonthDetails;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDetails;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.config.FinancialYearConfig;

public class MonthMain {
	
	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.of(2022, 01, 01);
		LocalDate endDate = LocalDate.of(2033, 2, 2);
		
		ApplicationContext  applicationContext= new AnnotationConfigApplicationContext(FinancialYearConfig.class);
	
		System.out.println("APplication Conf created");
		FinancialYearDetails financialYearDetails = applicationContext.getBean("financialYearDetails",FinancialYearDetails.class);
		financialYearDetails.setYearEndDate(endDate);
		financialYearDetails.setYearStartDate(startDate);
		System.out.println(financialYearDetails);
		financialYearDetails.setYearEndDate(endDate);
		financialYearDetails.setYearStartDate(startDate);
		
		System.out.println("--".repeat(50));
		
		MonthDetails monthDetails = applicationContext.getBean("monthDeatils", MonthDetails.class);
		
		System.out.println(monthDetails);
		
	}

}
