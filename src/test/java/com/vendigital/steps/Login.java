package com.vendigital.steps;

import com.vendigital.commons.Browser;
import com.vendigital.objects.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	Browser browser=new Browser();
	LoginPage loginPage=new LoginPage();
	
	
	//String username="prashanthb@planittesting.com";
	//String password="Nani201993@";
	
	/*@Before
	public void setUp() throws Exception {
		System.out.println("Login Test Setup");
		browser.setup();
	}*/
	
	@Given("^I am working in test environment \"([^\"]*)\"$")
	public void i_am_working_in_test_environment(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^I am testing the site \"([^\"]*)\"$")
	public void i_am_testing_the_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		browser.setup();
	}
	
	
	@Given("^user should have valid login credentials$")
	public void user_should_have_valid_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    //System.out.println(username+" "+password);
	}

	@When("^the user logs in using the Username as \"([^\"]*)\"$")
	public void the_user_logs_in_using_the_Username_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.passDatatoUsernameField(arg1);
	}

	@When("^the Password as \"([^\"]*)\"$")
	public void the_Password_as(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.passDatatoPasswordField(arg1);
	}
	
	@When("^clicks on Sign in button$")
	public void clicks_on_Sign_in_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.clickSignInButton();
	}

	@Then("^login should be successful\\.$")
	public void login_should_be_successful() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.verifyLoggedInPage();
	}
	
	@After
	public void tearDown() {
		browser.tearDown();
	}

}
