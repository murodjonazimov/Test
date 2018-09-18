package com.cybertek;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAmazonSearch {

	@Test

	public void goToAmazon() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		String str = "Selenium Testing Tools Cookbook - Second Edition";		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(str+Keys.ENTER);
		String xpath = "//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2";
		
		Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java OCA Book"+Keys.ENTER);
		
		
//		try {
			Assert.assertFalse(driver.findElement(By.xpath(xpath)).isDisplayed());
//		} catch (NoSuchElementException e) {
//			e.printStackTrace();
//		}
			//
		
		driver.close();
	}
}
