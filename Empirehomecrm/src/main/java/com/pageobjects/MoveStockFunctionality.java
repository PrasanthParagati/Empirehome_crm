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
import com.utils.Utils;

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
		
		
		Utils.dropdowns(movefrom, "Warehouse");
		Utils.dropdowns(moveto, "Showroom");
		
		notes.sendKeys(prop.getProperty("Notes"));
		
		Thread.sleep(2000);
		
		Utils.actions(driver, selectmnumber);
		
		textbox.sendKeys(prop.getProperty("TestBox"));
		textbox.sendKeys(Keys.ENTER);
		
		movingqty.sendKeys(prop.getProperty("MovingQty"));
		movingqty.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		addbutton.click();
		Thread.sleep(2000);
        savebutton.click();

		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
		Thread.sleep(2000);
		
		Utils.dropdowns(movefrom, "Showroom");
		Utils.dropdowns(moveto, "Warehouse");
		
        notes.sendKeys(prop.getProperty("Notes1"));
		
		Thread.sleep(2000);
		
		Utils.actions(driver, selectmnumber);
		
		textbox.sendKeys(prop.getProperty("TextBox1"));
		textbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		movingqty.sendKeys(prop.getProperty("MovingQty12"));
		movingqty.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		addbutton.click();
		Thread.sleep(2000);
        savebutton.click();
	}

}
