package com.testcases;

import org.testng.Assert;
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
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/");
	}
	
	@AfterMethod
	public void teardown() {
		
	}

}
