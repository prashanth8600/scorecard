package com.vendigital.commons;

import com.arm.framework.EnvironmentProperties;
import com.arm.framework.Selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Browser {
	
	public static Selenium page = new Selenium();
	public EnvironmentProperties env = new EnvironmentProperties();	
	
	@Before
	public void setup() throws Exception {
		System.out.println("Setup Browser");
		env.setParam("node", "");
		env.setParam("browser", "chrome");
		env.setParam("platform", "WIN10");
		env.setParam("version", "65");
		env.setParam("baseUrl", "https://scorecards-wheatley.apps.vendigital.network");
		page.OpenBrowser(env.getParam("browser"), env.getParam("node"), env.getParam("baseUrl"));
		page.WaitForPageToLoad();
	}
	
	
	@After
	public void tearDown() {
		System.out.println("Browser quit code here");
	}

}
