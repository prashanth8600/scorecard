package com.vendigital.steps;

import com.vendigital.objects.ClientAdminPage;
import com.vendigital.objects.HomePage;
import com.vendigital.objects.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Client_Admin {
	
	LoginPage login=new LoginPage();
	HomePage home=new HomePage();
	ClientAdminPage clientAdmin=new ClientAdminPage();
	String username="prashanthb@planittesting.com";
	String password="Nani201993@";
	
	@Given("^user is logged into the application successfully$")
	public void user_is_logged_into_the_application_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		login.loginWithSuccessfulVerification(username, password); 
		System.out.println("Login is done");
	}

	@When("^user clicks on the 'Client Admin' option under the Administrations link from the left hand side navigation panel$")
	public void user_clicks_on_the_Client_Admin_option_under_the_Administrations_link_from_the_left_hand_side_navigation_panel() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home.navigateToClientAdminPageFromHomePage();
	}

	@When("^user clicks on the \"([^\"]*)\" under client Administration list$")
	public void user_clicks_on_the_under_client_Administration_list(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clientAdmin.searchForSiteAdminAndClick(arg1);
	}

	@When("^user clicks on the '\\(\\+\\) Add User' icon on the Manage site Administrations screen$")
	public void user_clicks_on_the_Add_User_icon_on_the_Manage_site_Administrations_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clientAdmin.clickOnAddUserIcon();
	}

	@When("^user clicks on the '\\(\\+\\) Add Site Admin'icon for \"([^\"]*)\"  from the displayed Add A New Site Admin list$")
	public void user_clicks_on_the_Add_Site_Admin_icon_for_from_the_displayed_Add_A_New_Site_Admin_list(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clientAdmin.searchUserForSiteAdminAndClick(arg1);
	}

	@When("^user clicks on the 'Ok' button from the confirmation pop-up window$")
	public void user_clicks_on_the_Ok_button_from_the_confirmation_pop_up_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clientAdmin.clickOnOKButtonForConfirmation();
	}

	@Then("^a popup with 'Sucess' message as 'Added New Site Admin' with OK button should be displayed$")
	public void a_popup_with_Sucess_message_as_Added_New_Site_Admin_with_OK_button_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Code to Verify Success OK is displayed");
	}

	@Then("^user clicks on 'Ok' button$")
	public void user_clicks_on_Ok_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		clientAdmin.clickOnOKButtonSuccess();
	}

	@Then("^selected user should be displayed on the Manage site administrators list\\.$")
	public void selected_user_should_be_displayed_on_the_Manage_site_administrators_list() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Code to Verify Added User is displayed in the List");
	}
	

}
