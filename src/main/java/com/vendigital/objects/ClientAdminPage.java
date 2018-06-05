package com.vendigital.objects;

import com.arm.framework.Selenium;
import com.vendigital.commons.CommonMethods;

import gherkin.lexer.Th;

public class ClientAdminPage {
	
	public static Selenium page=new Selenium();
	CommonMethods commonMethods=new CommonMethods();
	
	private String lnk_siteAdmin(String searchSiteAdmin) {		
		return "//td[text()='"+searchSiteAdmin+"']";//return "//td[text()='Aero Components']";
	}	
	private String txt_searchFieldForSiteAdmin="//label[text()='Search:']/input";	
	private String btn_AddUser="//a[@title='Add User']/i";
	
	public void clickSiteAdmin(String searchSiteAdmin) throws Exception {
		page.Click(lnk_siteAdmin(searchSiteAdmin));
	}
	
	public void passDatatoSearchFieldForSiteAdmin(String searchSiteAdmin) throws Exception {
		page.Input(txt_searchFieldForSiteAdmin, searchSiteAdmin);
	}
	
	public void searchForSiteAdminAndClick(String searchSiteAdmin) throws Exception {
		passDatatoSearchFieldForSiteAdmin(searchSiteAdmin);
		page.WaitForPageToLoad();
		clickSiteAdmin(searchSiteAdmin);
	}
	
	public void clickOnAddUserIcon() throws Exception {
		page.Click(btn_AddUser);
		//page.WaitForPageToLoad();
		//page.ClickAndWait(btn_AddUser, txt_searchFieldForAddingUsers);
		Thread.sleep(2000);
	}
	
	
	//Add User Pop-up	

	private String txt_searchFieldForAddingUsers="//div[@id='available_admins_table_wrapper']//label[text()='Search:']/input";	
	private String lst_searchedUserAddButton="//table[@id='available_admins_table']//tbody//tr[1]/td[4]//a//i";//private String lst_searchedUserAddButton="//a[@title='']/i[@class='fa fa-plus']";
	private String btn_OKConfirmation="//button[text()='OK']";
	private String btn_OKSuccess="//button[text()='OK']";
	
	private String verifyUserAdd(String userToSearch) {
		return "//td[text()='"+userToSearch+"']";//return "//td[text()='Chris']";
	}
	
	public void clickUserToAddForSiteAdmin() throws Exception {
		//page.Click("//div[@class='modal-header']//button");
		//page.FindElements(lst_searchedUserAddButton).get(1).click();
		page.Click(lst_searchedUserAddButton);
	}
	
	public void passDatatoSearchFieldForUserToAddForSiteAdmin(String searchUserToAddForSiteAdmin) throws Exception {
		page.Input(txt_searchFieldForAddingUsers, searchUserToAddForSiteAdmin);
		//commonMethods.waitTillElementInvisible(lst_searchedUserAddButton);
		//page.WaitForElement(lst_searchedUserAddButton);
		Thread.sleep(2000);
	}
	
	public void searchUserForSiteAdminAndClick(String searchUserToAddForSiteAdmin) throws Exception {
		passDatatoSearchFieldForUserToAddForSiteAdmin(searchUserToAddForSiteAdmin);
		//page.WaitForPageToLoad(10L);
		clickUserToAddForSiteAdmin();
	}
	
	public void clickOnOKButtonForConfirmation() throws Exception {
		Thread.sleep(3000);
		page.Click(btn_OKConfirmation);
	}
	
	public void clickOnOKButtonSuccess() throws Exception {
		Thread.sleep(2000);
		page.Click(btn_OKSuccess);
	}
	

}
