package com.vendigital.objects;

import com.arm.framework.Selenium;

import gherkin.lexer.Th;

public class Issuescorecard {
	
	public static Selenium page=new Selenium();
	
	private String  IssueScorecardIcon = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/a[5]";
	private String Datefield = "//input[@class='form-control issue-scorecard-datepicker']";
	private String Datefieldselect = "//div[@class='datepicker-months']/table/thead/tr/th[2]";
	private String Yearselect = "//div[@class='datepicker-years']/table/tbody/tr/td/span[2]";
	private String Monthselect = "//div[@class='datepicker-months']/table/tbody/tr/td/span[6]";
	private String Submitbutton = "//button[@name='submit']";
	
	public void clickOnIssueScorecardIcon() throws Exception {
		page.Click(IssueScorecardIcon);
	}
	
	public void clickOnDatePickerField() throws Exception {
		Thread.sleep(2000);
		page.Click(Datefield);
	}

	public void clickOnCalendarHeader() throws Exception {
		//Thread.sleep(2000);
		page.Click(Datefieldselect);
	}

	public void selectYear() throws Exception {
		//Thread.sleep(2000);
		page.Click(Yearselect);
	}
	
	public void selectMonth() throws Exception {
		//Thread.sleep(2000);
		page.Click(Monthselect);
	}
	
	public void clickOnSubmitButton() throws Exception {
		page.Click(Submitbutton);
	}
}
