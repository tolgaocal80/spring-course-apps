package com.tolgaocal80;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private List<String> fortunes = new ArrayList<>();
	private String currentFortune;
	
	public RandomFortuneService() {
		fortunes.add("Your luckiest day: 1");
		fortunes.add("Your best day in the year: 2");
		fortunes.add("Your worst day I guess: 3");
		System.out.println("RandomFortuneService: no-arg constructor");
	}
	
	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(fortunes.size());
		currentFortune = fortunes.get(index);
		return currentFortune;
	}

}
