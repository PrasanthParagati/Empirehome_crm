package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.EndToEndFunctionality;
import com.pageobjects.Loginfunctionality;

public class EndToEndTest extends Basetest {
	
	Loginfunctionality lf;
	EndToEndFunctionality eef;
	
	public EndToEndTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		eef = new EndToEndFunctionality();
		
	}
	
	@Test (priority = 1)
	public void salesexecutivevalidation() throws Throwable {
		lf.verifysaleslogin();
		eef.customerregister();
		eef.verifysalesexecutiveaddcustomer(1);
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/");
	}
	
	@Test (priority = 2)
	public void salesorderdispatchvalidation() throws Throwable {
		lf.verifylogin();
		eef.verifysalesorderdispatch();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/AdminSales/PrintTaxInvoice?invoiceid=176");
	}

}
