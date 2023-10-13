package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.LoginwithDataprovider;
import com.utils.*;

public class LogintestWithMultipleData extends Basetest {
	
	LoginwithDataprovider lf;
	private final String sheetname = "login";

	public LogintestWithMultipleData() {
		super();   //invokes the parent class constructor
	}
	
	@DataProvider

	public String[][] dataload() throws Throwable {
		return Utils.Customerdata(sheetname);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new LoginwithDataprovider();

	}

	@Test(dataProvider = "dataload",dataProviderClass = LogintestWithMultipleData.class)

	public void loginvalidation(String username,String pass) {
		
		lf.verifylogin(username, pass);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
		

	}

	@AfterMethod
	public void teardown() {
		 // extentreports.flush();
		//driver.close();

	}

}
