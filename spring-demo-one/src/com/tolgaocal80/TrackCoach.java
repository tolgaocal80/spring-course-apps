package com.tolgaocal80;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		System.out.println("TrackCoach: no-arg constructor");
		this.fortuneService = fortuneService;
	}

	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It! Random Fortune" + fortuneService.getFortune();
	}
	
	
	// init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff method");
	}
	
	
	// destroy method
	public void doMyDestroyStuff() {
		System.out.println("TrackCoach: inside doMyDestroyStuff method");
	}
	
	
	
	
	
}









