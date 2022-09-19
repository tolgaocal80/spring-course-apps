package com.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private ArrayList<String> operatingSystems;
	private LinkedHashMap<String, String> countryOptions;
	private LinkedHashMap<String, String> favoriteLanguageOptions;
	private ArrayList<String> operatingSystemsOptions;
	
	public Student() {
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("TR", "Türkiye");
		countryOptions.put("USA", "Amerika");
		countryOptions.put("FR", "Fransa");
		countryOptions.put("AZ", "Azerbaycan");
		countryOptions.put("DE", "Germany");
		
		favoriteLanguageOptions = new LinkedHashMap<>();
		favoriteLanguageOptions.put("Java", "Java");
		favoriteLanguageOptions.put("C#","C#");
		favoriteLanguageOptions.put("Solidity", "Solidity");
		favoriteLanguageOptions.put("Flutter", "Flutter");
		favoriteLanguageOptions.put("JavaScript", "JavaScript");
		
		operatingSystemsOptions = new ArrayList<>();
		operatingSystemsOptions.add("Microsoft Windows");
		operatingSystemsOptions.add("Kali Linux");
		operatingSystemsOptions.add("Chrome OS");
		operatingSystemsOptions.add("Mac OS");
	}
	public ArrayList<String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}
	public ArrayList<String> getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(ArrayList<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
