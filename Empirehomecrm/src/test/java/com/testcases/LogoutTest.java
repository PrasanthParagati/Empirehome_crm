package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.LogoutFunctionality;

public class LogoutTest extends Basetest {
	
	Loginfunctionality lf;
	LogoutFunctionality logout;
	
	public LogoutTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		logout = new LogoutFunctionality();
		
		}
	
	@Test
	public void logoutvalidation() throws Throwable {
		
		logout.verifylogout();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Login']")).isDisplayed());
		
			}
	
	@AfterMethod
	public void teardown() {
		
	}

}
