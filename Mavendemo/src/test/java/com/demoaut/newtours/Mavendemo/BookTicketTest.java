 package com.demoaut.newtours.Mavendemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import com.demoaut.newtours.pages.*;

public class BookTicketTest extends BaseClass {
	
	
	@Test
	public void TicketBooking(){
		Login lp=new Login(driver);
		FlightFinder ff=new FlightFinder(driver);
		SelectFlight sf=new SelectFlight(driver);
		BookAFlight bf=new BookAFlight(driver);
		FlightConfirmation fc=new FlightConfirmation(driver);
	
		lp.ApplicationLogin("mercury", "mercury");
		ff.flightdetails();
		sf.Selflight();
		bf.BookFlight("APEKSHA", "DANGI", "6789");
		
		String ExpectedMessage="Your itinerary has been booked!";
		String ActualMessage=fc.itinery().getText();
		Assert.assertEquals(ActualMessage, ExpectedMessage);
	}
	

}
