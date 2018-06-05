package com.vendigital.objects;

import com.arm.framework.Selenium;

public class LoginPage {
	
	public static Selenium page=new Selenium();
	//LoginPage loginPage=new LoginPage();
	private String txt_username="//input[@id='username']";
	private String txt_password="//input[@id='password']";
	private String btn_SignIn="//strong[text()='Sign in']";
	private String loginPageTitle="Vendigital Login | Vendigital Applications | Reducing Cost and Risk in Your Supply Chain";
	private String loggedInPageTitle="Portal - Vendigital Applications | Vendigital Applications | Reducing Cost and Risk in Your Supply Chain";
	//private String verifyLogin="//h2[text()='Vendigital Portal']";
	private String loggedInPageTitleWithTermsAndConditions="Terms and Conditions | Vendigital Applications | Reducing Cost and Risk in Your Supply Chain";
	
	
	//Check-box Random
	//private String acceptCheckBox="//input[@name='acceptance']";
	//private String acceptButton="//input[@value='Accept']";
	
	public void passDatatoUsernameField(String username) throws Exception {
		page.Input(txt_username, username);
	}
	
	public void passDatatoPasswordField(String password) throws Exception {
		page.Input(txt_password, password);
	}
	
	public void clickSignInButton() throws Exception {
		page.Click(btn_SignIn);
		page.WaitForPageToLoad();
	}
	
	public void verifyLoginPage() throws Exception {
		//page.Assert(verifyLogin, value);
		page.Assert("title", loginPageTitle);
		System.out.println("Successfully verified Login page");
	}
	
	public void verifyLoggedInPage() throws Exception {
		//page.Assert(verifyLogin, value);
		page.Assert("title", loggedInPageTitle);
		System.out.println("Successfully verified Logged In page");
	}
	
	public void login(String username,String password) throws Exception {
		/*page.Input(txt_username, username);
		page.Input(txt_password, password);
		page.Click(btn_SignIn);*/
		passDatatoUsernameField(username);
		passDatatoPasswordField(password);
		clickSignInButton();
	}
	
	public void loginWithSuccessfulVerification(String username,String password) throws Exception {
		login(username, password);
		verifyLoggedInPage();
	}

}
