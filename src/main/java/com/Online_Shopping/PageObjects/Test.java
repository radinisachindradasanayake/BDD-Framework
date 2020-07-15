package com.Online_Shopping.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Online_Shopping.PageObjects.Register_Account;

public class Test {


	public static void main(String[]args) throws InterruptedException
	{
		WebDriver Driver;
		System.setProperty("webdriver.chrome.driver","C://Users//Radini Dasanayake//workspace//Online_Shopping//Drivers//chromedriver.exe");
		Driver = new ChromeDriver();
	    Driver.get("http://automationpractice.com/index.php");
	
		Register_Account RA= new Register_Account(Driver);
	//	RA.Select_Title(null);
				

	}

}
