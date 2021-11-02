package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalDetails extends Base {
	WebDriver driver;
	
	public PersonalDetails(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By FirstName=By.xpath("//input[@name='inputName']");
	By CreditCardNumber=By.xpath("//input[@name='creditCardNumber']");
	By NameOnCard=By.xpath("//input[@name='nameOnCard']");
	By RememberMe=By.xpath("//input[@name='rememberMe']");
		
	public WebElement FirstName() {
		return driver.findElement(FirstName);
	}
	public WebElement CreditCardNum() {
		return driver.findElement(CreditCardNumber);
	}
	public WebElement NameOnCard() {
		return driver.findElement(NameOnCard);
	}
	public WebElement RememberMe() {
		return driver.findElement(RememberMe);
	}
	
}
