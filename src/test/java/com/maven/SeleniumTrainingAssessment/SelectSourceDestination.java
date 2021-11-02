package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectSourceDestination {
	WebDriver driver;

	public SelectSourceDestination(WebDriver driver) {
		super();
		this.driver=driver;
	}
	
	By SourceCity=By.xpath("//Select[@name='fromPort']");
	By DestinationCity=By.xpath("//Select[@name='toPort']");
	By FindFlights=By.xpath("//input[@type='submit']");
	
	public WebElement selectSource() {
		return driver.findElement(SourceCity);
	}
	
	public WebElement selectDestination() {
		return driver.findElement(DestinationCity);
	}
	
	public WebElement findAvailableFlights() {
		return driver.findElement(FindFlights);
	}
}
