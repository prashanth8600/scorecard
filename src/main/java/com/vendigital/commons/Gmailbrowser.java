package com.vendigital.commons;

import com.arm.framework.EnvironmentProperties;
import com.arm.framework.Selenium;

public class Gmailbrowser {

	public static Selenium page = new Selenium();
	public EnvironmentProperties env = new EnvironmentProperties();	
	
	public void setupGmail() throws Exception {
		
		System.out.println("gmail is opening");
		System.out.println("Setup Browser");
		env.setParam("node", "");
		env.setParam("browser", "chrome");
		env.setParam("platform", "WIN10");
		env.setParam("version", "65");
		env.setParam("baseUrl1", "https://mail.google.com");
		page.OpenBrowser(env.getParam("browser"), env.getParam("node"), env.getParam("baseUrl1"));
		page.WaitForPageToLoad();
	}
}
