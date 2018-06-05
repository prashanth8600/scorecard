package com.vendigital.steps;
import com.vendigital.objects.HomePage;
import com.vendigital.objects.Managescorecard;
import com.vendigital.objects.SiteAdminPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Pa;

public class Manage_scorecard {
	
	public static HomePage home = new HomePage();
	public static SiteAdminPage siteadminpage = new SiteAdminPage();
	public static Managescorecard managescorecard = new Managescorecard();
		

	@When("^user click on the 'manage scorecard' icon for 'suppliername' in the 'my supplier' section$")
	public void user_click_on_the_manage_scorecard_icon_for_suppliername_in_the_my_supplier_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		managescorecard.clickOnManageScorecardButton();
	    
	}

	@When("^the 'mange scorecard for-' pop-up window will be displayed$")
	public void the_mange_scorecard_for_pop_up_window_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The pop-up window is opened");
	}

	@When("^user clicks on the '\\(X\\) delete scoracard' button under the options the pop-up window will open$")
	public void user_clicks_on_the_X_delete_scoracard_button_under_the_options_the_pop_up_window_will_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		managescorecard.clickOnDeleteScorecardButton();
	    
	}

	@When("^user click on the 'OK' button in the 'confirmation' pop-up window$")
	public void user_click_on_the_OK_button_in_the_confirmation_pop_up_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    siteadminpage.clickOnOkButtonConfirmation();
	}

	@When("^user click on the 'OK' button in the 'Success' pop-up window$")
	public void user_click_on_the_OK_button_in_the_Success_pop_up_window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    siteadminpage.clickOnOkButtonSucess();
	}

	@Then("^user click on the '\\(X\\) close' button the pop-up window will close$")
	public void user_click_on_the_X_close_button_the_pop_up_window_will_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    siteadminpage.clickOnCloseButton();
	}
	
}
