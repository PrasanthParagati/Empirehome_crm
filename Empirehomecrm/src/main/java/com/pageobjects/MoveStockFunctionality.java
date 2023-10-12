package com.pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;

public class MoveStockFunctionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;

	@FindBy(xpath = "//i[@class='fa fa-houzz']")
	WebElement inventory;

	@FindBy(xpath = "//a[normalize-space()='Move Stock']")
	WebElement movestock;

	@FindBy(xpath = "//select[@id='movedFromD']")
	WebElement movefrom;

	@FindBy(xpath = "//select[@id='movedToD']")
	WebElement moveto;

	@FindBy(xpath = "//input[@id='MoStNot']")
	WebElement notes;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement savebutton;

	@FindBy(xpath = "//span[@id='select2-invId-container']")
	WebElement selectmnumber;
	
	@FindBy (xpath = "//input[@role='textbox']")
	WebElement textbox;

	@FindBy(xpath = "//input[@id='qtymoving']")
	WebElement movingqty;

	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement addbutton;

	public MoveStockFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void verifymovingstock() throws Throwable {

		Thread.sleep(2000);
		element.click();

		inventory.click();

		movestock.click();
		
		Thread.sleep(2000);

		Select s1 = new Select(movefrom);
		s1.selectByVisibleText("Warehouse");

		Select s2 = new Select(moveto);
		s2.selectByVisibleText("Showroom");

		notes.sendKeys(prop.getProperty("Notes"));
		
		Thread.sleep(2000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(selectmnumber).click().perform();
		textbox.sendKeys(prop.getProperty("TestBox"));
		textbox.sendKeys(Keys.ENTER);
		
		Robot rb = new Robot();
		movingqty.sendKeys(prop.getProperty("MovingQty"));

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		addbutton.click();
		Thread.sleep(2000);
        savebutton.click();

		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
		Thread.sleep(2000);
        s1.selectByVisibleText("Showroom");
        s2.selectByVisibleText("Warehouse");              
        notes.sendKeys(prop.getProperty("Notes1"));
		
		Thread.sleep(2000);
		
		ac.moveToElement(selectmnumber).click().perform();
		textbox.sendKeys(prop.getProperty("TextBox1"));
		textbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		movingqty.sendKeys(prop.getProperty("MovingQty12"));

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		addbutton.click();
		Thread.sleep(2000);
        savebutton.click();
	}

}
