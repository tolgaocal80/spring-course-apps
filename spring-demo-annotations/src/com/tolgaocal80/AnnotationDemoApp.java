package com.tolgaocal80;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring file
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		
		
		// call method to get the daily fortune
		System.out.println(tennisCoach.getDailyFortune());
				
		//close the context
		context.close();

	}

}
