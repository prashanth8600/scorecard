package com.vendigital.steps;

import com.vendigital.objects.Registration;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Registration_supplier {
	
	Registration registerpage = new Registration();
	
	@Given("^user need to open the gmail account$")
	public void user_need_to_open_the_gmail_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  registerpage.gmailSetup();
	}
	@When("^user enter the email in the \"([^\"]*)\"$")
	public void user_enter_the_email_in_the(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    registerpage.passDataToGmailField(arg1);
	}

	@When("^user click on the Next button$")
	public void user_click_on_the_Next_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    registerpage.clickOnNextButton();
	}

	


	@When("^user enters the data in the \"([^\"]*)\" password field$")
	public void user_enters_the_data_in_the_password_field(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter the password");
		registerpage.passDataToPasswordfield(arg1);
}

	@Given("^user has to received the invitation mail$")
	public void user_has_to_received_the_invitation_mail() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    registerpage.clickOnUnreadMail();
	}

	@Given("^user enters the data in the \"([^\"]*)\" field$")
	public void user_enters_the_data_in_the_field(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^user click on the 'terms and conditions' checkbox$")
	public void user_click_on_the_terms_and_conditions_checkbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^user click on the 'submit' button the registration should be sucessfull$")
	public void user_click_on_the_submit_button_the_registration_should_be_sucessfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
}
