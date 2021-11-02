package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.WebDriver;

public class ValidateHomePage extends Base {
	WebDriver driver;
	String PageTitle;
	
	public ValidateHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String getTitle() {
		return PageTitle=driver.getTitle();
	}
	
	public void compareTitle(String HpTitle) {
		if (PageTitle.contains(HpTitle)) {
			System.out.println("Navigated to Home page");
		}
		else {
			System.out.println("Navigated to wrong page");
		}
	}
}
