package com.vendigital.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.arm.framework.Selenium;

public class SiteAdminPage {
	public static WebDriver driver;
	static int i;
	public static Selenium page=new Selenium();
	
	private String AllSupplierIcon ="//i[@class='fa fa-globe']";
	private String Emailfield = "//input[@name='email']";
	private String  Addemail = "//button[@class='btn btn-sm btn-primary btn-outline pull-right m-t-n-xs']";
	private String  Addtomysuppliersbutton = "//table[@id='DataTables_Table_1']/tbody/tr[2]//td[4]/span[2]";
	private String AddToMySupplierBtn = "//button[@class='btn btn-outline btn-primary ajax-link pull-right m-r-xs add-site-admin-supplier-btn']";
	private String  OkbuttonConfirmatiom = "//button[@class='confirm']";
	private String  OkbuttonSucess = "//button[@class='confirm']";
	private String  closebutton = "//button[@class='close']//following-sibling::span[text()='×']";
	private String RemoveMySuppliers = "//table[@id='DataTables_Table_1']/tbody/tr[2]//td[4]/span[2]";
	private String MultipleAddingSupplierBtn = "//table[@id='DataTables_Table_1']/tbody/tr[" +i+ "]//td[4]/span[2]";
	
	
/*	public void clickOnMultipleAddingSupplierBtn() throws Exception {
		for(i=1;i<=3;i++)
		{
			Thread.sleep(3000);
			page.Click(MultipleAddingSupplierBtn);
			//driver.findElement(By.xpath("//table[@id='DataTables_Table_1']/tbody/tr[" +i+ "]//td[4]/span[2]")).click();
	}
}*/
	//Adding supplier to my suppliers
	public void clickOnAllSupplierIcon() throws Exception {
		page.Click(AllSupplierIcon);
		}
	
	public void clickOnEmailField() throws Exception {
		Thread.sleep(2000);
		page.Click(Emailfield);
	}
	public  void passDataToEmailField(String enterEmailAddress) throws Exception {
		Thread.sleep(2000);
		page.Input(Emailfield, enterEmailAddress);
	}
	
	public void clickOnAddToMySuppliersButton() throws Exception {
		page.Click(Addtomysuppliersbutton);
	}
	
	public void clickOnAddEmailButton() throws Exception {
		page.Click(Addemail);
	}
	
	public void clickOnAddToMySuppliersBtn() throws Exception {
		Thread.sleep(2000);
		page.Click(AddToMySupplierBtn);
	}
	public void clickOnOkButtonConfirmation() throws Exception {
		Thread.sleep(3000);
		page.Click(OkbuttonConfirmatiom);
	}
	
	public void clickOnOkButtonSucess() throws Exception {
		Thread.sleep(3000);
		page.Click(OkbuttonSucess);
	}
	public void clickOnCloseButton() throws Exception {
		page.Click(closebutton);
	}
	
	
	//Removing suppliers from my suppliers
	public void clickOnRemoveSupplierIcon() throws Exception {
		page.Click(RemoveMySuppliers);
	}
	
	}
	

