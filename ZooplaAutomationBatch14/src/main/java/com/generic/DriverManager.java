package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.BaseConfigFile;

public class DriverManager {

public WebDriver getDriver()	{

	System.setProperty("webdriver.firefox.driver", "./Driver/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get(BaseConfigFile.getData("QA_Url"));
	driver.manage().window().maximize();		
	
	return driver;

}
	
	
}
