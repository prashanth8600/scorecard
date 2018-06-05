package com.vendigital.steps;

import com.vendigital.objects.LoginPage;
import com.vendigital.objects.LogoutPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logout {
	
	LoginPage login=new LoginPage();
	LogoutPage logout=new LogoutPage();
	String username="prashanthb@planittesting.com";
	String password="Nani201993@";
	
	@Given("^user should be logged into the application$")
	public void user_should_be_logged_into_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    login.loginWithSuccessfulVerification(username, password);
	}

	@When("^the user clicks on the 'profile' icon$")
	public void the_user_clicks_on_the_profile_icon() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    logout.clickProfileDropdownButton();
	}

	@Then("^the drop-down list with logout option is displayed$")
	public void the_drop_down_list_with_logout_option_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Profile dropdown list with logout option code here");
	}

	@Then("^user clicks on the 'logout' option$")
	public void user_clicks_on_the_logout_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		logout.clickLogoutButton();
	}

	@Then("^the user should be sucessfully logout from the application$")
	public void the_user_should_be_sucessfully_logout_from_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Verify logout code here");
	}


}
