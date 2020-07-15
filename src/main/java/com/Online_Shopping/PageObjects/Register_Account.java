package com.Online_Shopping.PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Register_Account 
{

		//Declaring web driver
			WebDriver Driver;
		
		 public Register_Account(WebDriver lDriver)
		 {
			 Driver	 =  lDriver;
			 PageFactory.initElements(lDriver, this);
		 
		 }
		 
		//Create an account definition			
			@FindBy(how = How.XPATH, using = "//a[@title='Log in to your customer account']")
			@CacheLookup
			static WebElement Button;
		 
		//Enter Email ID Definition		
			@FindBy(how = How.XPATH, using = "//*[@id='email_create']")
			@CacheLookup
			static WebElement Test;	
			
		//Enter Email ID Definition		
			@FindBy(how = How.XPATH, using = "//button[@name='SubmitCreate']//span[1]")
			@CacheLookup
			static WebElement CreateButton;	
			
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
		//Title definition			
			@FindBy(how = How.XPATH, using = "//div[@class = 'radio-inline']")
			@CacheLookup
			static WebElement Mr1;
			//*[@id="id_gender1"]
			
	   //Title definition			
			@FindBy(how = How.ID, using = "id_gender2")
			@CacheLookup
			static WebElement Mrs;
			
		//First Name Definition
			@FindBy(how = How.ID, using = "customer_firstname")
			@CacheLookup
			static WebElement First_Name;
		
		//Last Name Definition
			@FindBy(how = How.ID, using = "customer_lastname")
			@CacheLookup
			static WebElement Last_Name;
			
		//Email Definition
			@FindBy(how = How.ID, using = "email")
			@CacheLookup
			static WebElement Email;
			
		//Password Definition
			@FindBy(how = How.ID, using = "passwd")
			@CacheLookup
			static WebElement Password;
			
		//Days Definition
			@FindBy(how = How.ID, using = "days")
			@CacheLookup
			static WebElement Days;
			
		//Months Definition
			@FindBy(how = How.ID, using = "months")
			@CacheLookup
			static WebElement Months;
			
		//Years Definition
			@FindBy(how = How.ID, using = "months")
			@CacheLookup
			static WebElement Years;
/////////////////////////////////////////////////////////////////////////////////////////////////
			
		//FirstName Definition
			@FindBy(how = How.ID, using = "firstname")
			@CacheLookup
			static WebElement FirstName;	
			
		//LastName Definition
			@FindBy(how = How.ID, using = "lastname")
			@CacheLookup
			static WebElement LastName;		
		
		//Company Definition
			@FindBy(how = How.ID, using = "company")
			@CacheLookup
			static WebElement CompanyName;	
		
		//Address Definition
			@FindBy(how = How.ID, using = "address1")
			@CacheLookup
			static WebElement Address;		
			
		//Address Line 2 Definition
			@FindBy(how = How.ID, using = "address2")
			@CacheLookup
			static WebElement AddressLine2;	
		
		//City Definition
			@FindBy(how = How.ID, using = "city")
			@CacheLookup
			static WebElement City;	
			
		//State Definition
			@FindBy(how = How.ID, using = "id_state")
			@CacheLookup
			static WebElement State;		
			
		//Zip Definition
			@FindBy(how = How.ID, using = "postcode")
			@CacheLookup
			static WebElement Zip;	
			
		//Country Definition
			@FindBy(how = How.ID, using = "id_country")
			@CacheLookup
			static WebElement Country;	
		
		//Additional Information Definition
			@FindBy(how = How.ID, using = "other")
			@CacheLookup
			static WebElement Additional_Information;
			
		//Home Phone Definition
			@FindBy(how = How.ID, using = "phone")
			@CacheLookup
			static WebElement Home_Phone;	
		
		//Mobile Phone Definition
			@FindBy(how = How.ID, using = "phone_mobile")
			@CacheLookup
			static WebElement Mobile_Phone;
			
		//Alies Phone Definition
			@FindBy(how = How.ID, using = "alias")
			@CacheLookup
			static WebElement Alies;
			
		//Register Button Definition
			@FindBy(how = How.ID, using = "submitAccount")
			@CacheLookup
			static WebElement Register;	
			
			
			public void Select_Title(String ti,String fName,String lName,String pw,String BD,String Name,String Name2,String Company,String Add1,String State,String State2,String Zip1,String AInfor,String Hp,String Mp,String Alias) throws InterruptedException 
			{
				
				Button.click();
				Test.sendKeys("test699610@gmail.com");
				CreateButton.click();
				//Selecting the Title
				Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				List<WebElement> rdBtn_Sex = Driver.findElements(By.name("id_gender"));
				System.out.println(rdBtn_Sex.size());
				String Mr = null;
				
				if(Mr != ti){}
			
				
				First_Name.sendKeys(fName);
				Last_Name.sendKeys(lName);
				Password.sendKeys(pw);
				
				Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Select the days
				
				String BirthDay = BD;
				Select oSelect = new Select(Driver.findElement(By.name("days")));
				List <WebElement> elementCount = oSelect.getOptions();
				int iSize = elementCount.size();
				for(int i =0; i<iSize ; i++)
				{
					
					String sValue = elementCount.get(i).getText();
					if(BD==sValue)
					{
						elementCount.get(i).click();
					}
					
				}
				
				
				//Selecting the months
				
				Select oSelectM = new Select(Driver.findElement(By.name("months")));
				List <WebElement> elementCountM = oSelectM.getOptions();
				int iSizeM = elementCountM.size();
				for(int i =0; i<iSizeM ; i++){
					
					String sValueM = elementCountM.get(i).getText();
					if(BD==sValueM)
					{
						elementCountM.get(i).click();
					}
					
					}
				
				//Selecting the Year
				Select oSelectY = new Select(Driver.findElement(By.name("months")));
				List <WebElement> elementCountY = oSelectY.getOptions();
				int iSizeY = elementCountY.size();
				for(int i =0; i<iSizeY ; i++){
					
					String sValueY = elementCountY.get(i).getText();
					if(BD==sValueY)
					{
						elementCountY.get(i).click();
					}
					
					}
				
				FirstName.sendKeys(Name);
				LastName.sendKeys(Name2);
				CompanyName.sendKeys(Company);
				Address.sendKeys(Add1);
				//AddressLine2.sendKeys(Add2);
				City.sendKeys(State);
				
				
				//Selecting the state
				Select oSelectS = new Select(Driver.findElement(By.name("id_state")));
				List <WebElement> elementCountS = oSelectS.getOptions();
				int iSizeS = elementCountS.size();
				for(int i =0; i<iSizeS ; i++)
				{	
			 		String sValueS = elementCountS.get(i).getText();
			 		if(sValueS.equals(State2)){	
						System.out.println(sValueS);
						elementCountS.get(i).click();}
			 		
					
				}	
				
				Zip.sendKeys(Zip1);
							Additional_Information.sendKeys(AInfor);
							Home_Phone.sendKeys(Hp);
							Mobile_Phone.sendKeys(Mp);
							Alies.sendKeys(Alias);
							Register.click();
			}
				
				
}
			
			
			

