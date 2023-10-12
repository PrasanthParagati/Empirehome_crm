package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class EmployeeRegistrationFunctionality extends Basetest {

	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//span[normalize-space()='Staff']")
	WebElement staff;
	
	@FindBy (xpath = "//a[normalize-space()='Add New Staff']")
	WebElement addnewstaff;
	
	@FindBy (xpath = "//input[@placeholder='Name']")
	WebElement name;
	
	@FindBy (xpath = "//input[@placeholder='Enter Your Mail']")
	WebElement mailid;
	
	@FindBy (xpath = "//input[@placeholder='Mobile Number']")
	WebElement mobilenumber;
	
	@FindBy (xpath = "//span[@id='select2-UserTypeId-container']")
    WebElement designation;
	
	@FindBy (xpath = "//input[@role='textbox']")
	WebElement textbox;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	public EmployeeRegistrationFunctionality() {
		PageFactory.initElements(driver,this);
	}
	
	public void verifyemployee() throws Throwable {
		
		Thread.sleep(2000);
		element.click();
		
		staff.click();
		addnewstaff.click();
		name.sendKeys(prop.getProperty("Employeename"));
		mailid.sendKeys(prop.getProperty("Emailid"));
		mobilenumber.sendKeys(prop.getProperty("moblieNumber"));
		designation.click();
		textbox.sendKeys(prop.getProperty("staffDesignationTextbox"));
		textbox.sendKeys(Keys.ENTER);
		savebutton.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
