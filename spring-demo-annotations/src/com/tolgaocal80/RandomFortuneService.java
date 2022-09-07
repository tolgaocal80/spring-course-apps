package com.tolgaocal80;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] fortunes = {
			"Diligence is the mother of good luck",
			"The journey is the reward",
			"Beware of the wolf in sheep's clothing"
	};
	
	private Random  random = new Random();
	

	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.length);
		
		String theFortune = fortunes[index];
		
		return theFortune;
	}

}
