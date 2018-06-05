package com.vendigital.objects;

import com.arm.framework.Selenium;

public class Managescorecard {

	public static Selenium page=new Selenium();
	
	private String Managescorecardicon = "//table[@id='DataTables_Table_0']/tbody/tr[1]/td[9]/a[4]";
	private String Deletescorecardbutton = "//table[@id='issued_supplier_scorecards_table']/tbody/tr[1]/td[3]/a/i";
	
	public void clickOnManageScorecardButton() throws Exception {
		Thread.sleep(3000);
		page.Click(Managescorecardicon);
	}
	
	public void clickOnDeleteScorecardButton() throws Exception {
		page.Click(Deletescorecardbutton);
	}
	
	
}
