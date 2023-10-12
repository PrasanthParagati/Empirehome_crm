package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.HolidaysFunctionality;
import com.pageobjects.Loginfunctionality;

public class HolidaysTest extends Basetest {
	
	Loginfunctionality lf;
	HolidaysFunctionality hf;
	
	public HolidaysTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
	    hf = new HolidaysFunctionality();
	}
	
	@Test
	public void holidayvalidation() throws Throwable {
		
		hf.verifyholiday();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Holidays");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.close();
	}

}
