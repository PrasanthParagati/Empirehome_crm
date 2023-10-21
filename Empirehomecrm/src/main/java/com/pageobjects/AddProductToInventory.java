package com.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class AddProductToInventory extends Basetest {

	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//i[@class='fa fa-houzz']")
	WebElement inventory;
	
	@FindBy (xpath = "//a[text()='Add Inventory']")
	WebElement addinventory;
	
	@FindBy (xpath = "//input[@placeholder='Enter Model Number']")
	WebElement modelnumber;
	
	@FindBy (xpath ="//textarea[@name='Title']")
	WebElement title;
	
	@FindBy (xpath = "//textarea[@name='ItemDescription']")
	WebElement description;
	
	@FindBy (xpath = "//input[@placeholder='Enter Height']")
	WebElement height;
	
	@FindBy (xpath = "//input[@placeholder='Enter Width']")
	WebElement width;
	
	@FindBy (xpath = "//input[@placeholder='Enter Breadth']")
	WebElement breadth;
	
	@FindBy (xpath = "//input[@placeholder='Enter Color Name']")
	WebElement colorname;
	
	@FindBy (xpath = "//input[@id='actual']")
	WebElement actualprice;
	
	@FindBy (xpath = "//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span")
	WebElement mrpfactor;
			
	@FindBy (xpath = "//li[contains(text(), '3.00')]")
	WebElement factorselect;
	
	@FindBy (name = "Qty")
	WebElement quantity;
	
	@FindBy (xpath = "//input[@name='ProductMainImageUploaded']")
	WebElement imageupload;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	@FindBy (xpath = "//input[@placeholder='Search']")
	WebElement modelsearch;
	
	public AddProductToInventory() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	public void verifyaddproduct(String MNumber,String ItemTitle,String ItemDescription,String Height,String Width,String Breadth,String ColorName,String ActualPrice, String Qty) throws Throwable {
		
		Thread.sleep(3000);
		
		element.click();
		
		inventory.click();
		
		addinventory.click();
		
		modelnumber.sendKeys(MNumber);
		
		title.sendKeys(ItemTitle);
		
		description.sendKeys(ItemDescription);
		
		height.sendKeys(Height);
		
		width.sendKeys(Width);
		
		breadth.sendKeys(Breadth);
		
		colorname.sendKeys(ColorName);
		
		Thread.sleep(3000);
		
		actualprice.sendKeys(ActualPrice);
		
		mrpfactor.click();
		
		Thread.sleep(3000);
		
		factorselect.click();			
			    
		quantity.sendKeys(Qty);
		
		Thread.sleep(2000);
		
		Utils.actions(driver, imageupload);
		
		Utils.robot(prop.getProperty("imagepath"));
		
		Thread.sleep(2000);
				
			savebutton.click();
			
			Thread.sleep(2000);
			
			modelsearch.sendKeys(prop.getProperty("Modelsearch"));
			modelsearch.sendKeys(Keys.ENTER);
			
			
			
		
		
		
	}
		
}
