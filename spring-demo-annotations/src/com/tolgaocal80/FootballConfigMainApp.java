package com.tolgaocal80;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballConfigMainApp {
	
	public static void main(String[] args) {
		
		// read configuration from class
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(FootballConfiguration.class);
		
		// get the bean from spring container
		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		
		// call methods from the bean
		System.out.println(footballCoach.getDailyFortune());
		System.out.println(footballCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
	}

}
