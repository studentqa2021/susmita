package com.Testing;

import org.openqa.selenium.WebDriver;

import com.generic.BaseLogin;
import com.generic.DriverManager;

public class SmokeTest {
static	WebDriver driver;	
public static void main(String[] args) {

	//DriverManager obj = new DriverManager();	
	driver=new DriverManager().getDriver();
	new BaseLogin().getLogin(driver);
	
}
}
