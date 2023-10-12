package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CustomerFunctionality;
import com.pageobjects.Loginfunctionality;

public class CustomerTest extends Basetest {
	
	Loginfunctionality lf;
	CustomerFunctionality cf;
	
	public CustomerTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
	    cf = new CustomerFunctionality();
	}
	
	@Test
	public void customervalidation() throws Throwable {
		
		cf.verifycustomer();
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/User/CustomerList");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.close();
	}

}
