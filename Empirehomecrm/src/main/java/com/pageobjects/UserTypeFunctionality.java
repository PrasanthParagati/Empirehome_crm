package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class UserTypeFunctionality extends Basetest {
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement masters;
	
	@FindBy (xpath = "//a[normalize-space()='User Types']")
	WebElement usertype;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement addnew;
	
	@FindBy (xpath = "//input[@id='TypeName']")
	WebElement typename;
	
	@FindBy (xpath = "//input[@id='TypeCode']")
	WebElement typecode;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	
	@FindBy (xpath = "//tbody/tr[1]/td[4]/a[1]/button[1]/i[1]")
	WebElement edit;
	
	
	public UserTypeFunctionality() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyusertype() throws Throwable {
		
		Thread.sleep(2000);
		
		element.click();
		
		masters.click();
		usertype.click();
		
		Thread.sleep(2000);
		
		Utils.actions(driver, addnew);
				
		typename.sendKeys(prop.getProperty("TypeName"));
		typecode.sendKeys(prop.getProperty("TypeCode"));
		Thread.sleep(2000);
		savebutton.click();
		
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Master/UserTypes");
		search.sendKeys(prop.getProperty("Search"));
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		Utils.actions(driver, edit);
		
		typename.clear();
		typename.sendKeys(prop.getProperty("edittypename"));
		Thread.sleep(2000);
		savebutton.click();
		
		
		}
	
	}
