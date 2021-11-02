package com.maven.SeleniumTrainingAssessment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class PlaneBookingTC extends Base {
	@Test
	public void TC001() throws IOException, InterruptedException {
		driver=BrowserCall();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("URL"));
		Thread.sleep(2000);
		
		ValidateHomePage hTitle=new ValidateHomePage(driver);
		hTitle.getTitle();
		System.out.println("HomePage title is "+hTitle.getTitle());
		hTitle.compareTitle(properties.getProperty("HomePageTitle"));
		
		SelectSourceDestination sourcedest=new SelectSourceDestination(driver);
		sourcedest.selectSource().sendKeys(properties.getProperty("Source"));
		sourcedest.selectDestination().sendKeys(properties.getProperty("Destination"));
		Thread.sleep(2000);
		System.out.println("Source City is "+properties.getProperty("Source"));
		System.out.println("Destination City is "+properties.getProperty("Destination"));
		sourcedest.findAvailableFlights().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		ValidateReservePage rTitle=new ValidateReservePage(driver);
		System.out.println("Reserve Page title is "+rTitle.getTitle());
		rTitle.compareTitle(properties.getProperty("ReservePageTitle"));
		
		ValidatePurchasePage prTitle=new ValidatePurchasePage(driver);
		prTitle.ChooseFlight().click();
		Thread.sleep(2000);
		System.out.println("Purchase Page title is "+prTitle.getTitle());
		prTitle.compareTitle(properties.getProperty("PurchasePageTitle"));
		
		PersonalDetails detail=new PersonalDetails(driver);
		detail.FirstName().sendKeys(properties.getProperty("FirstName"));
		detail.CreditCardNum().sendKeys(properties.getProperty("CreditCardNum"));
		detail.NameOnCard().sendKeys(properties.getProperty("NameOnCard"));
		detail.RememberMe().click();
		Thread.sleep(2000);
		System.out.println("Personal Details entered");
		
		ValidateConfirmationPage crTitle=new ValidateConfirmationPage(driver);
		crTitle.ConfirmOrder().click();
		Thread.sleep(2000);
		System.out.println("Confirmation Page title is "+crTitle.getTitle());
		crTitle.compareTitle(properties.getProperty("ConfirmationPageTitle"));
				
		PrintPurchaseDetails pDetail=new PrintPurchaseDetails(driver);
		System.out.println("Total Amount is "+pDetail.TotalAmount().getText());
		System.out.println("Card Number is "+pDetail.CreditCardNum().getText());
		System.out.println("Expiration Date is "+pDetail.ExpirationDate().getText());
		
		driver.close();
	}
	
}
