package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.UserTypeFunctionality;

public class UserTypeTest extends Basetest {
	
	Loginfunctionality lf;
	UserTypeFunctionality ut;
	
	public UserTypeTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();

		lf = new Loginfunctionality();
		lf.verifylogin();
		
		ut = new UserTypeFunctionality();
	}
	
	@Test
	public void usertypevalidation() throws Throwable {
		
		ut.verifyusertype();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.close();
		
	}

}
