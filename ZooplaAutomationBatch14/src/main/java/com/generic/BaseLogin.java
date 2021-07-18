package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.util.BaseConfigFile;
import com.util.Highliter;
import com.util.ScreenShot;

public class BaseLogin {

public void getLogin(WebDriver driver) {

	MasterPageFactory pf = new MasterPageFactory(driver);	

	ScreenShot.getScreenShot(driver, "Home page");
	if(pf.getAcceptAllCookies().isDisplayed()) {
	Highliter.getcolour(driver, pf.getAcceptAllCookies());	
	
	pf.getAcceptAllCookies().click();
	}
		
	pf.getSignin().click();
	pf.getEmail().sendKeys(BaseConfigFile.getData("user"));
	pf.getPass().sendKeys(BaseConfigFile.getData("pass"));
	pf.getFinalSignin().click();
	//pf.getMyZooplaBtn().click();
	//mouse hover
	//pf.getSigninout().click();
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	Actions ac = new Actions(driver);
	ac.moveToElement(pf.getMyZooplaBtn()).perform();;
	
	//pf.getSigninout().click();
	
	 if(pf.getSigninout().isDisplayed()){ System.out.println("Test passed");
	  Assert.assertTrue(pf.getSigninout().isDisplayed());
	 
	  }else { System.out.println("Test Failed");
	  Assert.assertTrue(pf.getSigninout().isDisplayed()); 
	  }
	
}


	
}
