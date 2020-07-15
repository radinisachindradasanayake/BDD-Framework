package com.Online_Shopping.PageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import Utilities.ReadConfig;
import org.junit.*;




public class BaseClass 
{

	public static Logger logger;
	
	//Initiating Global WebDriver
			public static WebDriver Driver;
		//Initiating an Object for ReadConfig 
			ReadConfig readconfig = new ReadConfig();
		//Calling for method to get URL
			public String URL=readconfig.GetApplicationURL();
		//Calling for method to get Email
			public String Email =readconfig.GetEmail();
		//Calling for method to get Password
			public String Password=readconfig.GetPassword();

	@BeforeClass
	 
	public void setup()
	{
		String br="chrome";
		logger = Logger.getLogger("");
		//PropertyConfigurator.configure("log4j.properties");
	
		if(br.equals("chrome"))
		{
		///System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Users//Radini Dasanayake//workspace//Online_Shopping//Drivers//chromedriver.exe");
		Driver = new ChromeDriver();
		}
		
		else if (br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C://Users//Radini Dasanayake//workspace//Online_Shopping//Drivers//IEDriverServer.exe");
			Driver = new InternetExplorerDriver();
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.ie.driver","C://Users//Radini Dasanayake//workspace//Online_Shopping//Drivers//geckodriver.exe");
			Driver = new FirefoxDriver();
		}	
		Driver.get("http://automationpractice.com/index.php");
	}
	
@AfterClass
    public void teardown()
    {
    	//Driver.quit();
    }
	
	public void captureScreen(WebDriver driver, String tname) throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
