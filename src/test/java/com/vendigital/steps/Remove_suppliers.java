package com.vendigital.steps;

import com.arm.framework.Selenium;
import com.vendigital.objects.HomePage;
import com.vendigital.objects.SiteAdminPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Remove_suppliers {
	
	public static Selenium page=new Selenium();
	public static HomePage home = new HomePage();
	public static SiteAdminPage siteadminpageadd = new SiteAdminPage();
	
	
	@Given("^supplier should add under the my suppliers section$")
	public void supplier_should_add_under_the_my_suppliers_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		home.clickScorecardsLink(); 
		siteadminpageadd.clickOnAllSupplierIcon();
	}

	@Given("^user click on the 'Remove supplier from my suppliers' icon under the options the pop-up window will open$")
	public void user_click_on_the_Remove_supplier_from_my_suppliers_icon_under_the_options_the_pop_up_window_will_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   siteadminpageadd.clickOnRemoveSupplierIcon();
	}

	@Given("^user click on the 'Ok' button it will display the 'Success' message was successfully removed from your suppliers successfully'$")
	public void user_click_on_the_Ok_button_it_will_display_the_Success_message_was_successfully_removed_from_your_suppliers_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   siteadminpageadd.clickOnOkButtonConfirmation();
	}

	@Then("^user click on the 'Ok' button the pop-up window will close$")
	public void user_click_on_the_Ok_button_the_pop_up_window_will_close() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   siteadminpageadd.clickOnOkButtonSucess();
	}


}
