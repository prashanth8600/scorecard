package com.vendigital.objects;

import com.arm.framework.Selenium;
import com.vendigital.commons.Gmailbrowser;

import gherkin.lexer.Th;

public class Registration {
	
	public static Selenium page=new Selenium();

	Gmailbrowser browser = new Gmailbrowser();
	public void gmailSetup() throws Exception {
		browser.setupGmail();
	
}
	private String GmailField = "//div[@class='aCsJod oJeWuf']//input[@id='identifierId']";
	private String GPasswordField = "//input[@type='password']";
	private String Nextbutton = "//span[text()='Next']";
	private String Unreadmail = "//div[@class='aDP']//div[text()='unread, ']/span[text()='Scorecards - Test']";
	
	
	public void passDataToGmailField(String emailid) throws Exception {
		page.Input(GmailField, emailid);
	}
	
	public void passDataToPasswordfield(String passwordfield) throws Exception {
		Thread.sleep(2000);
		page.Input(GPasswordField, passwordfield);
	}
	
	public void clickOnNextButton() throws Exception {
		page.Click(Nextbutton);
		System.out.println("Hello");
		
	}
	
	public void clickOnUnreadMail() throws Exception {
	System.out.println("unread email searching");
		page.WaitForPageToLoad();
		page.Click(Unreadmail);
	}
}