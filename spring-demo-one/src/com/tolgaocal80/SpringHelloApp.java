package com.tolgaocal80;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
	
	public static void main(String[] args) {
		
		//load the spring conf. file
		//retrieve bean from spring container
		//call methods on the bean
		//close the context.
		
		// create a spring container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach baseballCoach = context.getBean("myBaseballCoach", Coach.class);
		Coach newGuy = context.getBean("boxCoach", Coach.class);
		Coach trackCoach = context.getBean("myTrackCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(baseballCoach.getDailyWorkout());
		// call methods on the bean
		System.out.println(baseballCoach.getDailyFortune());
		
		System.out.println(trackCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
