package com.vendigital.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.arm.framework.Selenium;

public class CommonMethods {
	
	public static Selenium page = new Selenium();
	
	public void waitTillElementInvisible(String xpathExpression) throws Exception{
		Thread.sleep(4000);
		WebDriverWait wait=new WebDriverWait(page.driver(), 10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathExpression)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));
		System.out.println("Wait condition satisfied");
	}
	

}
