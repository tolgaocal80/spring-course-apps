package com.tolgaocal80;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		CricketCoach myCricketCoach = (CricketCoach) context.getBean("myCricketCoach", Coach.class);
		
		// call methods from bean
	//	System.out.println(myCricketCoach.getDailyWorkout());
	//	System.out.println(myCricketCoach.getDailyFortune());
		
		// call our new methods to get the literal values
	//	System.out.println(myCricketCoach.getEmailAddress());
	//	System.out.println(myCricketCoach.getTeam());
		
		
		TrackCoach myTrackCoach = (TrackCoach) context.getBean("myTrackCoach", Coach.class);
		
		System.out.println(myTrackCoach.getDailyFortune ());
		
		
		// close the context
		context.close();
	}

}
