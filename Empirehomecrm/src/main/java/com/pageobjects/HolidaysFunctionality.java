package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class HolidaysFunctionality extends Basetest {
	
	@FindBy (xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;
	
	@FindBy (xpath = "//span[normalize-space()='Masters']")
	WebElement masters;
	
	@FindBy (xpath = "//a[normalize-space()='Holidays']")
	WebElement holidays;
	
	@FindBy (xpath = "//a[normalize-space()='Add New']")
	WebElement addnew;
	
	@FindBy (xpath = "//input[@name='HolidayDate']")
	WebElement holidaydate;
	
	@FindBy (xpath = "//input[@id='HolidayName']")
	WebElement holidayname;
	
	@FindBy (xpath = "//input[@id='HolidayDesc']")
	WebElement holidaydescription;
	
	@FindBy (xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	
	@FindBy (xpath = "//tbody/tr[45]/td[5]/a[1]/button[1]/i[1]")
	WebElement edit;
	
	@FindBy (xpath = "//tbody/tr[46]/td[5]/a[2]/button[1]/i[1]")
	WebElement delete;
	
	@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement alrt;
	
	
	public HolidaysFunctionality() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyholiday() throws Throwable {
		
		Thread.sleep(2000);
		 element.click();
		 
		 Thread.sleep(2000);
		 masters.click();
		 
		 Thread.sleep(2000);
		 holidays.click();
		 
		 Thread.sleep(2000);
		 addnew.click();
		 
		 Thread.sleep(2000);
		 holidaydate.sendKeys(prop.getProperty("HolidayDate"));
		 holidayname.sendKeys(prop.getProperty("HolidayName"));
		 holidaydescription.sendKeys(prop.getProperty("HolidayDes"));
		 savebutton.click();
		 
		 
		 driver.navigate().to("http://empirehome.myprojectsonline.co.in/Master/Holidays");
		 Thread.sleep(2000);
		 edit.click();
		 holidaydescription.clear();
		 holidaydate.sendKeys(prop.getProperty("editholidayadate"));
		 holidaydescription.sendKeys(prop.getProperty("editedname"));
		 Thread.sleep(2000);
		 savebutton.click();
		 
		 driver.navigate().to("http://empirehome.myprojectsonline.co.in/Master/Holidays");
		 Thread.sleep(2000);
		 delete.click();
		 Thread.sleep(2000);
		 alrt.click();
		 
		 
		 
		 }

}
