package com.tolgaocal80;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@PostConstruct
	public void myStartupStuff() {
		System.out.println("FootballCoach postContruct method called");
	}
	
	@PreDestroy
	public void myDestroyStuff() {
		System.out.println("FootballCoach preDestroy method called");
	}
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot 100 penalties.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
