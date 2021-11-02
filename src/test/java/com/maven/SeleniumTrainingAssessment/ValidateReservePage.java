package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.WebDriver;

/* This class is used to Validate the the Reserve Page Title of the travel Web site */

public class ValidateReservePage extends Base {
	WebDriver driver;
	String PageTitle;
	
	public ValidateReservePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String getTitle() {
		return PageTitle=driver.getTitle();
	}
	
	public void compareTitle(String RsTitle) {
		if (PageTitle.contains(RsTitle)) {
			System.out.println("Navigated to Reserve page");
		}
		else {
			System.out.println("Navigated to wrong page");
		}
	}
}
