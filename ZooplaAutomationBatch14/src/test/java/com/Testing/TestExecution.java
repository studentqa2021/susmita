package com.Testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.BaseLogin;
import com.generic.DriverManager;

public class TestExecution {
	WebDriver driver;
@BeforeTest	
public void setup() {
	DriverManager dm = new DriverManager();
	 driver =dm.getDriver();
	 //or
	 //new DriverManager().getDriver();
}

@Test
public void Login() {
	BaseLogin bl= new BaseLogin();
	bl.getLogin(driver);
	//or
	//new BaseLogin().getLogin(driver);
	}

@AfterTest
public void TearDown() {
driver.quit();	
}
}
