package com.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CustomerFunctionality extends Basetest {
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//span[normalize-space()='Customers']")
	WebElement customers;
	
	@FindBy (xpath = "//a[normalize-space()='Add Customer']")
	WebElement addcustomer;
	
	@FindBy (xpath = "//input[@placeholder='Enter Customer Name']")
	WebElement name;
	
	@FindBy (xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement number;
	
	@FindBy (xpath = "//input[@placeholder='Enter Email Id']")
	WebElement mailid;
	
	@FindBy (xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement watsappnumber;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	@FindBy (xpath = "//input[@class='form-control form-control-sm']")   
	WebElement search;
	
	@FindBy (xpath = "//tbody/tr[1]/td[11]/a[1]/button[1]/i[1]")
	WebElement edit; 
	
	@FindBy (xpath = "//tbody/tr[1]/td[11]/a[3]/button[1]/i[1]")
	WebElement delete;
	
	@FindBy (xpath = "//button[text()='Yes']")
	WebElement alrt;
	
	
	
	
	
	public CustomerFunctionality() {
		PageFactory.initElements(driver, this);
	}
	
	public void verifycustomer() throws Throwable {
		
		Thread.sleep(2000);
		element.click();
		customers.click();
		addcustomer.click();
		name.sendKeys(prop.getProperty("Customername"));
		number.sendKeys(prop.getProperty("Mobilenumber"));
		mailid.sendKeys(prop.getProperty("Emailid"));
		watsappnumber.sendKeys(prop.getProperty("Wnumber"));
		savebutton.click();
		
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/User/CustomerList");
		
		search.sendKeys(prop.getProperty("searchname"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		name.clear();
		name.sendKeys(prop.getProperty("editcustname"));
		Thread.sleep(2000);
		savebutton.click();
		
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/User/CustomerList");
		
		search.sendKeys(prop.getProperty("deletename"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		delete.click();
		
		 alrt.click();
//		Alert alt= driver.switchTo().alert();
//		Thread.sleep(2000);
//		alt.accept();
		
		
		
		
	}
	
	
	
	
	

}
