package com.tolgaocal80;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("awesomeFortuneService")
	private FortuneService fortuneService;
	
	
	// constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default no-arg constructor");
	}
	
	// define init method
	@PostConstruct
	public void initMethodExample() {
		System.out.println(">> TennisCoach: inside initMethodExample()");
	}
	
	// define destroy method
	@PreDestroy
	public void destroyMethodExample() {
		System.out.println(">> TennisCoach: inside destroyMethodExample()");
	}
	

	
	/*
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}*/
	
	
	/*
	// define a setter method
	@Autowired
	@Qualifier("randomFortuneService")
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println(">> TennisCoach: inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
