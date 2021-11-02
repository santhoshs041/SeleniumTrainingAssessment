package com.maven.SeleniumTrainingAssessment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


/* This is the Base Class used to call different browsers by getting input data from Data.properties */
public class Base {

	public WebDriver driver;
	public Properties properties;
	@Test
	public WebDriver BrowserCall() throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\00002803\\eclipse\\training\\SeleniumTrainingAssessment\\Data.properties");
		properties=new Properties();
		properties.load(file);
		String vBrowser=properties.getProperty("Browser");
		if (vBrowser.equalsIgnoreCase("chrome")) {
			System.out.println("Chrome Browser is set");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00002803\\eclipse\\chrome_driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(vBrowser.equalsIgnoreCase("Edge")){
			System.out.println("Edge Browser is set");
			System.setProperty("webdriver.edge.driver", "C:\\Users\\00002803\\eclipse\\edge_driver\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			System.out.println("Invalid Browser");
		}
		return driver;
		}
	}