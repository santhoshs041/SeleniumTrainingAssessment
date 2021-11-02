package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidatePurchasePage extends Base {
	WebDriver driver;
	String PageTitle;
	
	public ValidatePurchasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By SearchFlight=By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input");
		
	public WebElement ChooseFlight() {
		return driver.findElement(SearchFlight);
	}
	
		public String getTitle() {
		return PageTitle=driver.getTitle();
	}
	
	public void compareTitle(String PhTitle) {
		if (PageTitle.contains(PhTitle)) {
			System.out.println("Navigated to Purchase page");
		}
		else {
			System.out.println("Navigated to wrong page");
		}
	}
}
