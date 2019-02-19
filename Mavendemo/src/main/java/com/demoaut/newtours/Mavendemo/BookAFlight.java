package com.demoaut.newtours.Mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
@FindBy(name="passFirst0")
private WebElement first;

@FindBy(name="passLast0")
private WebElement last;

@FindBy(name="creditnumber")
private WebElement ccnumber;

@FindBy(name="buyFlights")
private WebElement buy;

public BookAFlight(WebDriver driver){
	PageFactory.initElements(driver,this);
	}

public void BookFlight(String fs,String ls,String ccnumb){
	first.sendKeys(fs);
	last.sendKeys(ls);
	ccnumber.sendKeys(ccnumb);
	buy.submit();
}






}
