package com.Online_Shopping.StepDefinitions;

import com.Online_Shopping.PageObjects.BaseClass;
import com.Online_Shopping.PageObjects.Register_Account;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_Step_Definition extends BaseClass{

	@Given("^: Open Choosed Browser Successfully$")
	public void Open_Choosed_Browser_Successfully() throws Throwable 
	{
		BaseClass BC =new BaseClass();
		BC.setup();
		logger.info("URL is Opened");
		
	}
	
	@When("^: Enter URL Successfully$")
	public void Enter_URL_Successfully() throws Throwable {
		
	}
	@And("^: Click on Sign IN Link$")
	public void Click_on_Sign_IN_Link() throws Throwable {
	    
	}

	@And("^: Enter Email Address$")
	public void Enter_Email_Address() throws Throwable {
	    
	}

	@And("^: Click on Create an Account Button$")
	public void Click_on_Create_an_Account_Button()throws Throwable {
	   
	}

	@And("^: Click on Register Button$")
	public void Click_on_Register_Button() throws Throwable {
		Register_Account R=new Register_Account(Driver);
		R.Select_Title("Mr", "fName", "lName", "Test123", "02-11-1990","FNAME","LNAME","COMPANY","ADDRESS1","Florida","Georgia","00000","Test","0221323462","0983339102","Test Form");
	   
	}
	
	@Then("^: User able to create an account successfully$")
	public void User_able_to_create_an_account_successfully() throws Throwable {
	    
	}
}
