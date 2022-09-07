package com.tolgaocal80;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class AwesomeFortuneService implements FortuneService {

	private Random random = new Random();
	private List<String> fortunesFromFile = new ArrayList<String>();;
	private String filePath = "fortunesText.txt";
	
	@PostConstruct
	public void readFortunesFromFile() {
		System.out.println("Entered to AwesomeFortuneService PostConstruct method");
		Path path = Paths.get(filePath);
		try {
			BufferedReader br = Files.newBufferedReader(path);
			String line;
			while((line = br.readLine()) != null) {
				fortunesFromFile.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			String line;
			while((line = bufferedReader.readLine()) != null ) {
				fortunesFromFile.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}
	
	/*
	public List<String> getTextFromFile(List<String> fortunesFromFile, String filePath) {
		
		Path path = Paths.get(filePath);
		try {
			BufferedReader br = Files.newBufferedReader(path);
			String line;
			while((line = br.readLine()) != null) {
				fortunesFromFile.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	//	try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
	//		String line;
	//		while((line = bufferedReader.readLine()) != null ) {
	//			fortunesFromFile.add(line);
	//		}
	//	} catch (IOException e) {
	//		e.printStackTrace();
	//	}
		
		return fortunesFromFile;
	}*/
	
	
	@Override
	public String getFortune() {
		return fortunesFromFile.get(random.nextInt(fortunesFromFile.size()));
	}

}
