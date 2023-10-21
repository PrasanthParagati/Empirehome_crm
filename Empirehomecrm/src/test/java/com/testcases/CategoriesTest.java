package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CategoriesFunctionality;
import com.pageobjects.Loginfunctionality;

public class CategoriesTest extends Basetest {
	
	Loginfunctionality lf;
	CategoriesFunctionality ctf;
	
	public CategoriesTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		ctf = new CategoriesFunctionality();
	}
	
	
	@Test (priority = 1)
	public void addnewcategoryvalidation() throws Throwable {
		ctf.common();
		ctf.verifyaddnewcategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 8);
		
	}
	
	@Test (priority = 2)
	public void editcategoryvalidation() throws Throwable {
		//ctf.common();
		ctf.verifyeditcategory();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Categories");
	}
	
	@Test (priority = 3)
	public void deletecategoryvalidation() throws Throwable {
		
		ctf.verifydeletecategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    Assert.assertEquals(recordcount, 7);
	}

	@AfterTest
	public void teardown() {
		
	}
	

}
