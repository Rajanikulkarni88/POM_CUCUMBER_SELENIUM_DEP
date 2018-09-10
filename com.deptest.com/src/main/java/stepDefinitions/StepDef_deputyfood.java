package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementLocators.ElementLocators_deputyfood;
import utilityLibrary.WebUtils;

public class StepDef_deputyfood extends WebUtils
{
	
	private static final String TestFirst = null;

	@Given("^I want to open website deputyfood$")
	public void i_want_to_open_website_deputyfood() throws Throwable {
		WebUtils.openbrwoser("https://foodcourt.au.deputy.com");
	       
	}

	@When("^I want to enter valid credential$")
	public void i_want_to_enter_the_username() throws Throwable {
		WebUtils.entervalue("testautomation+james@deputy.com", ElementLocators_deputyfood.Username);
		WebUtils.entervalue("deputy22%", ElementLocators_deputyfood.Password);	    
	}

	@Then("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		WebUtils.clickbutton(ElementLocators_deputyfood.LoginButton);
				
	}

	@Then("I click on Schedule tab add employee$")	
	public void i_click_on_Schedule_tab_add_employee() throws Throwable {
		WebUtils.clickbutton(ElementLocators_deputyfood.Scheduletab);
		WebUtils.clickitem(ElementLocators_deputyfood.AddEmployee);
			
	}
		
	@Then("I enter firstname lastname email mobile$")
	public void i_enter_firstname_lastname_email_mobile() throws Throwable
	{
		
		
		WebUtils.enterfirstname("TestFirst",ElementLocators_deputyfood.FirstName);
		WebUtils.entervalue("TestLast",ElementLocators_deputyfood.LastName);
		String testemail= generateEmail(30);
		
		WebUtils.entervalue(testemail, ElementLocators_deputyfood.Email);
		WebUtils.entervalue("12345678",ElementLocators_deputyfood.Mobile);
		
		WebUtils.clicksavebutton(ElementLocators_deputyfood.SaveDetails);
			
		WebUtils.openbrwoser("https://www.mailinator.com/");
		WebUtils.entervalue(testemail, ElementLocators_deputyfood.TestEmail);
		WebUtils.clickbutton(ElementLocators_deputyfood.Nextbutton);
		

	}
	
	public String generateEmail(int length) {
		  String allowedChars="abcd" +   //alphabets
		    "123" ;   //numbers		  
		  String email="";
		  String temp=RandomStringUtils.random(length,allowedChars);
		  email=temp.substring(0,temp.length()-9)+"@test.com";
		  return email;
		  
		 }
	@Then("I login to email click on generated link$")
	public void i_login_to_email_click_on_generated_link() throws Throwable
	{
			
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebUtils.clickitem(ElementLocators_deputyfood.VerifyLink);	
					
	}
	
   @Then("I verify the logged in user TestFirst(.+)$")
  
	  public void i_verify_the_logged_in_user() throws Throwable
	  	  {
	   String obj1 = TestFirst;
	   equals(obj1);
	    WebUtils.closethedriver();
	    }
		  
	  }
	  
  
