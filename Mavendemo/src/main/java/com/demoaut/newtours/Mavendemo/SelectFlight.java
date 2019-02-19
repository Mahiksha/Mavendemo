package com.demoaut.newtours.Mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input")
	private WebElement depart;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input")
	private WebElement arrival;
	
	@FindBy(name="reserveFlights")
	private WebElement reserve;
	
	public SelectFlight(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
	
	public void Selflight(){
		depart.click();
		arrival.click();
		reserve.submit();
	}

}
