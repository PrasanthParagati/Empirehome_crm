package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.EmployeeRegistrationFunctionality;
import com.pageobjects.Loginfunctionality;

public class EmployeeRegistrationTest extends Basetest{
	
	Loginfunctionality lf;
	EmployeeRegistrationFunctionality ef;
	
	public EmployeeRegistrationTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		ef = new EmployeeRegistrationFunctionality();
		
		
	}
	
	@Test
	public void EmployeeRegistrationValidation() throws Throwable {
		
		ef.verifyemployee();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Holidays");
	}
	
	

}
