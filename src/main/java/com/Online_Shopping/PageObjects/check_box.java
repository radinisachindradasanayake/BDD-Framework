package com.Online_Shopping.PageObjects;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class check_box {

	public static void main(String[] args) {
		
WebDriver Driver;
		System.setProperty("webdriver.chrome.driver","C://Users//Radini Dasanayake//workspace//Online_Shopping//Drivers//chromedriver.exe");
		Driver = new ChromeDriver();
	
	
			 WebDriver driver = new ChromeDriver();
			
			 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 // Launch the URL
			 driver.get("http://toolsqa.com/automation-practice-form");
			 
			 
			 List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
			 System.out.println(rdBtn_Sex.size());
			
			 boolean bValue = false;
			 
			
			 bValue = rdBtn_Sex.get(0).isSelected();
			 
			 
			 if(bValue == true){
			
			 rdBtn_Sex.get(1).click();
			 }else{
			 
			 rdBtn_Sex.get(0).click();
			 }
			 
			 
			 
			 //Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
			 WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
			 rdBtn_Exp.click();
			 
			 // STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)
			 // Find the Check Box or radio button element by Name
			 List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
			 
			 // This will tell you the number of Check Boxes are present
			 int iSize = chkBx_Profession.size();
			 
			 // Start the loop from first Check Box to last Check Box
			 for(int i=0; i < iSize ; i++ ){
			 // Store the Check Box name to the string variable, using 'Value' attribute
			 String sValue = chkBx_Profession.get(i).getAttribute("value");
			 
			 // Select the Check Box it the value of the Check Box is same what you are looking for
			 if (sValue.equalsIgnoreCase("Automation Tester")){
			 chkBx_Profession.get(i).click();
			 // This will take the execution out of for loop
			 break;
			 }
			 }
			 // Step 6: Check the Check Box 'Selenium IDE' for category 'Automation Tool' (Use cssSelector)
			 WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
			 oCheckBox.click();
			 
			 // Kill the browser
			// driver.quit();
			 
			 }
			 

	}


