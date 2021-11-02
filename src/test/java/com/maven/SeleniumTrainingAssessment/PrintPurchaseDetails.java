package com.maven.SeleniumTrainingAssessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/* This class is used to Print the final purchase details */

public class PrintPurchaseDetails extends Base {
	WebDriver driver;
	
	public PrintPurchaseDetails(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By Amount=By.xpath("/html/body/div[2]/div/table/tbody/tr[3]/td[2]");
	By CardNumber=By.xpath("/html/body/div[2]/div/table/tbody/tr[4]/td[2]");
	By Expiration=By.xpath("/html/body/div[2]/div/table/tbody/tr[5]/td[2]");
		
	public WebElement TotalAmount() {
		return driver.findElement(Amount);
	}
	public WebElement CreditCardNum() {
		return driver.findElement(CardNumber);
	}
	public WebElement ExpirationDate() {
		return driver.findElement(Expiration);
	}
}
