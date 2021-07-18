package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {

public	MasterPageFactory(WebDriver driver){
PageFactory.initElements(driver, this);
	
	}
	
	
@FindBy(xpath="(//*[contains(text(),'Accept all cookies')])[2]")	
private WebElement acceptAllCookies;	
	
@FindBy(xpath="(//*[contains(@class,'css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0')])[4]")	
private WebElement signin;

@FindBy(xpath="//*[contains(@name,'email')]")	
private WebElement Email;

@FindBy(xpath="//*[contains(@id,'input-password')]")	
private WebElement Pass;

@FindBy(xpath="(//*[contains(text(),'Sign in')])[10]")	
private WebElement FinalSignin;

@FindBy(xpath="(//*[contains(text(),'My Zoopla')])[1]")	
private WebElement MyZooplaBtn;

@FindBy(xpath="(//*[contains(text(),'Sign out')])[1]")	
private WebElement Signinout;

public WebElement getAcceptAllCookies() {
	return acceptAllCookies;
}


public WebElement getSignin() {
	return signin;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getPass() {
	return Pass;
}

public WebElement getFinalSignin() {
	return FinalSignin;
}

public WebElement getMyZooplaBtn() {
	return MyZooplaBtn;
}

public WebElement getSigninout() {
	return Signinout;
}



}
