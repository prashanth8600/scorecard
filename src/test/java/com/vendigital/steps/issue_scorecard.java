package com.vendigital.steps;

import com.arm.framework.Selenium;
import com.vendigital.objects.HomePage;
import com.vendigital.objects.Issuescorecard;
import com.vendigital.objects.SiteAdminPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class issue_scorecard {
	
	public static Selenium page=new Selenium();
	public static HomePage home = new HomePage();
	public static Issuescorecard issuescorecard = new Issuescorecard();
	public static SiteAdminPage siteadminpage = new SiteAdminPage();
	
	@Given("^user should be on the my suppliers page$")
	public void user_should_be_on_the_my_suppliers_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
		home.clickScorecardsLink();
}
	
	@When("^user click on the 'issue scorecard' icon for \"([^\"]*)\" in the 'my supplier' section$")
	public void user_click_on_the_issue_scorecard_icon_for_in_the_my_supplier_section(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    issuescorecard.clickOnIssueScorecardIcon();
	}

	@Then("^'issue Scorecard for-' pop-up window will be displayed$")
	public void issue_Scorecard_for_pop_up_window_will_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user click on the 'date picker' field$")
	public void user_click_on_the_date_picker_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 issuescorecard.clickOnDatePickerField();
	}

	@When("^user should able to view the 'calendar'$")
	public void user_should_able_to_view_the_calendar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    issuescorecard.clickOnCalendarHeader();
	}

	@When("^user click on the 'year' present in the calendar$")
	public void user_click_on_the_month_present_in_the_calendar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    issuescorecard.selectYear();
	}

	@When("^verify the 'month_year' combination displayed in the 'Date' field$")
	public void verify_the_month_year_combination_displayed_in_the_Date_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    issuescorecard.selectMonth();
	}

	@When("^user click on 'submit' button$")
	public void user_click_on_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    issuescorecard.clickOnSubmitButton();
	}

	@Then("^the user should able to view the success message for 'issued scorecard'$")
	public void the_user_should_able_to_view_the_success_message_for_issued_scorecard() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    siteadminpage.clickOnOkButtonSucess();
	}
	
	@Then("^user click on the 'close' button the opened pop-up window will close$")
	public void user_click_on_the_close_button_the_opened_pop_up_window_will_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		siteadminpage.clickOnCloseButton();
	}

}
