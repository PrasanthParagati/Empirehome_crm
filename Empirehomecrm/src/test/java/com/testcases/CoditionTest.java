package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.ConditionFunctionality;
import com.pageobjects.Loginfunctionality;

public class CoditionTest extends Basetest {
	
	Loginfunctionality lf;
	ConditionFunctionality condition;
	
	public CoditionTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		condition = new ConditionFunctionality();
	}
	
	
	@Test (priority = 1)
	public void addnewconditionvalidation() throws Throwable {
		
		condition.verifyaddcondition();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 36);
	}
	
	@Test (priority = 2)
	public void editconditionvalidation() throws Throwable {
		
		condition.verifyeditcondition();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Condition");
		
		
	}
	
	
	@Test (priority = 3)
	public void deleteconditionvalidation() throws Throwable {
		
		condition.verifydeletecondition();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 35);
		
		
	}
	
	@AfterTest
	public void teardown() {
		
	}

}
