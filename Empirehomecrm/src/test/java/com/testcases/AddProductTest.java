package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.AddProductToInventory;
import com.pageobjects.Loginfunctionality;
import com.utils.Utils;

public class AddProductTest extends Basetest {
	
	Loginfunctionality lf;
	AddProductToInventory product;
	private final String sheetname = "addproduct";
	
	public AddProductTest() {
		super();
	}
	
	@DataProvider
	public String[][] dataload() throws Throwable{
		return Utils.Customerdata(sheetname);
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		lf = new Loginfunctionality();
		lf.verifylogin();
		
		product = new AddProductToInventory();		
		
	}
	
	
	@Test(dataProvider  ="dataload",dataProviderClass = AddProductTest.class)
	public void addproductvalidation(String MNumber,String ItemTitle,String ItemDescription,String Height,String Width,String Breadth,String ColorName,String ActualPrice, String Qty) throws Throwable {
		
		product.verifyaddproduct(MNumber, ItemTitle, ItemDescription, Height, Width, Breadth, ColorName, ActualPrice, Qty);
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
		
		
		}
	
	@AfterMethod
	public void teardown() {
		//driver.close();


}
}
