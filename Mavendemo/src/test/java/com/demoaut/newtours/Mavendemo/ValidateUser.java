package com.demoaut.newtours.Mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.demoaut.newtours.pages.FlightFinder;
//import com.demoaut.newtours.pages.Login;

public class ValidateUser extends BaseClass {
	
	@Test
	public void UserValidation(){
		Login lp=new Login(driver);
		FlightFinder ff=new FlightFinder(driver);
		lp.ApplicationLogin("mercury", "mercury");
		ff.signof().isDisplayed();
		Assert.assertTrue(true);
		
	}

}
