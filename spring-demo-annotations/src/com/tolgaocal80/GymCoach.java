package com.tolgaocal80;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {
	
	@Autowired
	@Qualifier("awesomeFortuneService")
	private FortuneService fortuneService;
	
	

	@Override
	public String getDailyWorkout() {
		return "Do some chest-press like 10x4 and 30kgs";
	}

	@Override
	public String getDailyFortune() {return fortuneService.getFortune();}
}