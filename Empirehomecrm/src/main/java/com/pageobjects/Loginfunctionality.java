package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Loginfunctionality extends Basetest {

   @FindBy (xpath="//input[@placeholder='example@gmail.com']")   
   WebElement userid;
	
   @FindBy (name="pword")
   WebElement pass;
  
   
   @FindBy (xpath="//button[text()='Login']")
   WebElement loginbutton;
   
   public Loginfunctionality() {           //constructor
	   
	   PageFactory.initElements(driver,this);
   }
   
   
   public void verifylogin() {
	   
	  userid.sendKeys(prop.getProperty("username")); 
	   pass.sendKeys(prop.getProperty("password"));
	   loginbutton.click();
   }
   
   public void verifysaleslogin() {
	   
	   userid.sendKeys(prop.getProperty("salesusername")); 
	   pass.sendKeys(prop.getProperty("salespassword"));
	   loginbutton.click();
	   
   }
   
	
}
