package com.tolgaocal80;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FootballConfiguration {
	
	@Bean
	public FortuneService perfectFortuneService() {
		return new PerfectFortuneService();
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(perfectFortuneService());
	}

}
