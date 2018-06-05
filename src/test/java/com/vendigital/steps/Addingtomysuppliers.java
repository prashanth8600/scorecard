package com.vendigital.steps;

import com.arm.framework.Selenium;
import com.vendigital.objects.HomePage;
import com.vendigital.objects.SiteAdminPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addingtomysuppliers{
	
	public static Selenium page=new Selenium();
	public static HomePage home = new HomePage();
	public static SiteAdminPage siteadminpageadd = new SiteAdminPage();

@Given("^user shoule be able to login with sucessfully")
public void user_shoule_be_able_to_login_with(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

@When("^user select the 'Scorecard' from the application list$")
public void user_select_the_Scorecard_from_the_application_list() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	home.clickScorecardsLink(); 
}

@When("^user click on the 'All suppliers' tab in the 'supplier' index page$")
public void user_click_on_the_All_suppliers_tab_in_the_supplier_index_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	siteadminpageadd.clickOnAllSupplierIcon();
  
}

@When("^user click on the 'Add supplier to my suppliers' icon under the options the 'Contact information' pop-up window will open$")
public void user_click_on_the_Add_supplier_to_my_suppliers_icon_under_the_options_the_Contact_information_pop_up_window_will_open() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  siteadminpageadd.clickOnAddToMySuppliersButton();
}

@When("^user enters the \"([^\"]*)\" address in the email$")
public void user_enters_the_address_in_the_email(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//siteadminpageadd.clickOnEmailField();
	siteadminpageadd.passDataToEmailField(arg1);
	
}

@When("^user click on the 'Add email' button the supplier email address will added below under the 'Supplier email' column$")
public void user_click_on_the_Add_email_button_the_supplier_email_address_will_added_below_under_the_Supplier_email_column() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	siteadminpageadd.clickOnAddEmailButton();
}


@When("^user click on the 'Add to my supplier' button the email address is sucessfully added$")
public void user_click_on_the_Add_to_my_supplier_button_the_email_address_is_sucessfully_added() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   siteadminpageadd.clickOnAddToMySuppliersBtn();
}

@When("^user click on the 'Ok' button it will display the 'Sucess' message as supplier is added to your suppliers$")
public void user_click_on_the_Ok_button_it_will_display_the_Sucess_message_as_supplier_is_added_to_your_suppliers() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  siteadminpageadd.clickOnOkButtonConfirmation();
}

@When("^user click on the 'Ok' button the opend pop-up window will close$")
public void user_click_on_the_Ok_button_the_opend_pop_up_window_will_close() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  siteadminpageadd.clickOnOkButtonSucess();
}

@Then("^the user click on the 'Close/\\(X\\)' button the 'Contact information pop-up window will close$")
public void the_user_click_on_the_Close_X_button_the_Contact_information_pop_up_window_will_close() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  siteadminpageadd.clickOnCloseButton();
}

}
