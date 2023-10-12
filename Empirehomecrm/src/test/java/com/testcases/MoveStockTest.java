package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.pageobjects.MoveStockFunctionality;

public class MoveStockTest extends Basetest {
	Loginfunctionality lf;
	MoveStockFunctionality stock;

	public MoveStockTest() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		lf = new Loginfunctionality();
		lf.verifylogin();

		stock = new MoveStockFunctionality();

	}

	@Test
	public void stockmovevalidation() throws Throwable {

		stock.verifymovingstock();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

	}

}
