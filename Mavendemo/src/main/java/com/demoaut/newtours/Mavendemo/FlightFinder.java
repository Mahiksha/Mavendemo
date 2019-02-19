package com.demoaut.newtours.Mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")
	private WebElement oneway;
	
	@FindBy(name="fromPort")
	private WebElement from;
	
	@FindBy(name="fromMonth")
	private WebElement month;
	
	@FindBy(name="fromDay")
	private WebElement day;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")
	private WebElement Business;
	
	@FindBy(name="airline")
	private WebElement air;
	
	@FindBy(name="findFlights")
	private WebElement find;
	
	@FindBy(linkText="SIGN-OFF")
	private WebElement signoff;
	
	public FlightFinder(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
	
	public void flightdetails(){
		oneway.click();
		Select departure=new Select(from);
		departure.selectByIndex(1);
		Select months=new Select(month);
		months.selectByIndex(4);
		Select days=new Select(day);
		months.selectByIndex(4);
		Business.click();
		Select line=new Select(air);
		months.selectByIndex(2);
		find.submit();
		
		
	}
	public WebElement signof(){
		return signoff;
		}
	}


