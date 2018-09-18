package com.cybertek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class Batch8 {
	public static void main(String[] args) {
		
		WebDriver driver;
		Faker faker = new Faker();
		
		String credicard = faker.finance().creditCard();
		System.out.println(credicard);
		
		
		
	}

}
