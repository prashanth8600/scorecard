package com.vendigital.objects;

import com.arm.framework.Selenium;

public class HomePage {
	
	public static Selenium page=new Selenium();
	
	private String lnk_Scorecards="//a[text()='Scorecards']";
	private String lnk_Administration="//span[text()='Administration']";
	private String lnk_ClientAdmin="//a[text()='Client Admin']";
	
	public void clickScorecardsLink() throws Exception {
		page.Click(lnk_Scorecards);
	}
	
	public void clickAdministrationLink() throws Exception {
		page.Click(lnk_Administration);
		Thread.sleep(1000);
	}
	
	public void clickClientAdminLink() throws Exception {
		page.Click(lnk_ClientAdmin);
	}
	
	public void navigateToClientAdminPageFromHomePage() throws Exception {
		clickScorecardsLink();
		clickAdministrationLink();
		clickClientAdminLink();
		page.WaitForPageToLoad();
	}

}
