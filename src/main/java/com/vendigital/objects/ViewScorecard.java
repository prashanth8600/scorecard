package com.vendigital.objects;

import com.arm.framework.Selenium;

import gherkin.lexer.Th;

public class ViewScorecard {
	
	 
	public static Selenium page=new Selenium();
	
	private String ViewscorecardIcon = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/a[1]";
	private String Totalscoredatabutton = "//h5[text()='Total Score Data']";
	private String OTIFData = "//h5[text()='OTIF Data']";
	private String Calendar = "//i[@class='fa fa-calendar']";
	private String Filtericon = "//i[@class='fa fa-sitemap']";
	private String Icon = "//div[@data-site-id='6']";
	private String Icon1 = "//div[@data-site-id='7']";
	private String Icon2 = "//div[@data-site-id='4']";
	private String Removeall = "//i[@class='fa fa-times']/..";
	private String Selectall = "//button[@class='btn btn-primary btn-outline m-r-sm ven-site-filter-button ven-site-select-all']";
	private String Applyfilter = "//button[@class='btn btn-outline btn-primary pull-right ven-site-filter-apply']";
	
	public void clickOnViewScorecardIcon() throws Exception {
		page.Click(ViewscorecardIcon);
	}
	
	public void clickOnTotalScoreDataButton() throws Exception {
		page.ScrollToElement(Totalscoredatabutton);
	}
	
	public void scrollToOtifData() throws Exception {
		Thread.sleep(3000);
		page.ScrollToElement(OTIFData);
	}
	
	public void clickOnCalendarICon() throws Exception {
		page.Click(Calendar);
	}
	public void clickOnFilterIcon() throws Exception {
		page.Click(Filtericon);
	}
	public void DragandDrop() throws Exception {
		Thread.sleep(2000);
		page.DragAndDropElement(Icon, Icon1);
		Thread.sleep(2000);
		page.DragAndDropElement(Icon1, Icon2);
	}
	
	public void clickOnRemoveallButton() throws Exception {
		page.ClickAndWait(Removeall, Selectall);
	}
	
	public void clickOnSelectallButton() throws Exception {
		page.ClickAndWait(Selectall, Applyfilter);
	}
	
	public void clickOnApplyFilterButton() throws Exception {
		page.Click(Applyfilter);
	}
}