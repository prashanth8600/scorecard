package com.vendigital.steps;

import com.vendigital.objects.ViewScorecard;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class View_Scorecard {
	
	public static ViewScorecard viewscorecard = new ViewScorecard();
	
	@Given("^user click on the 'view scorecard' button the 'view scorecard' page will display$")
	public void user_click_on_the_view_scorecard_button_the_view_scorecard_page_will_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    viewscorecard.clickOnViewScorecardIcon();
	}

	@Given("^user scroll down to the 'Total Score Data' section$")
	public void user_scroll_down_to_the_Total_Score_Data_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    viewscorecard.clickOnTotalScoreDataButton();
	    viewscorecard.scrollToOtifData();
	}
	
	@Given("^user click on the 'filter' icon the pop-up will open$")
	public void user_click_on_the_filter_icon_the_pop_up_will_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		viewscorecard.clickOnFilterIcon();

	}

	@Given("^user drap and drop the 'site name' from active site to available site and vice-versa$")
	public void user_drap_and_drop_the_site_name_from_active_site_to_available_site_and_vice_versa() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		viewscorecard.DragandDrop();
	    
	}

	@Given("^user click on the 'remove all' button the sites will disappear under the 'Active sites'$")
	public void user_click_on_the_remove_all_button_the_sites_will_disappear_under_the_Active_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		viewscorecard.clickOnRemoveallButton();
	    
	}

	@Given("^user click on the 'select all' button the sites will disappear under the 'Available sites'$")
	public void user_click_on_the_select_all_button_the_sites_will_disappear_under_the_Available_sites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		viewscorecard.clickOnSelectallButton();
	    
	}

	@Then("^user click on the 'filter' button the pop-up window will close$")
	public void user_click_on_the_filter_button_the_pop_up_window_will_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  viewscorecard.clickOnApplyFilterButton();
	}
	    
	}