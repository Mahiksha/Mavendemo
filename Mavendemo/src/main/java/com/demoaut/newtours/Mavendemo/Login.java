package com.demoaut.newtours.Mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(name="userName")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement signin;
	
	public Login(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	
	public void ApplicationLogin(String uname,String pname){
		username.sendKeys(uname);
		pass.sendKeys(pname);
		signin.click();
	}
	

}
