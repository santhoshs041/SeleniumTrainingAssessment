package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* This class is used to Validate the Confirmation Screen Title after purchase */

public class ValidateConfirmationPage extends Base {
	WebDriver driver;
	String PageTitle;
	
	public ValidateConfirmationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By Submit=By.xpath("//input[@type='submit']");
		
	public WebElement ConfirmOrder() {
		return driver.findElement(Submit);
	}
	
		public String getTitle() {
		return PageTitle=driver.getTitle();
	}
	
	public void compareTitle(String CnTitle) {
		if (PageTitle.contains(CnTitle)) {
			System.out.println("Navigated to Confirmation page");
		}
		else {
			System.out.println("Navigated to wrong page");
		}
	}
}
