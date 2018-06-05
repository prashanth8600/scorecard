package com.vendigital.objects;

import com.arm.framework.Selenium;

public class LogoutPage {
	
	public static Selenium page=new Selenium();
	LoginPage login=new LoginPage();
	
	private String lnk_profileDropdown="//b[@class='caret']";
	private String lnk_logout="//a[text()='Logout']";
	//private String btn_SignIn="//strong[text()='Sign in']";
	//private String verifyLogin="//h2[text()='Vendigital Portal']";
	
	
	
	public void clickProfileDropdownButton() throws Exception {
		page.Click(lnk_profileDropdown);
	}
	
	public void clickLogoutButton() throws Exception {
		page.Click(lnk_logout);
	}
	
	public void logoutFromHomePage() throws Exception {
		clickProfileDropdownButton();
		clickLogoutButton();
	}

}
