package com.pageobjects;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Basetest;
import com.utils.Utils;

public class EndToEndFunctionality extends Basetest {

	@FindBy(xpath = "//strong[normalize-space()='Select Customer']")
	WebElement selectcustomer;

	@FindBy(xpath = "//a[@class='btn common-btn mt-3']")
	WebElement register;

	@FindBy(xpath = "//input[@placeholder='Full Name']")
	WebElement fullname;

	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement mobilenumber;

	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;

	@FindBy(xpath = "//input[@placeholder='Whatsapp Number']")
	WebElement whatsappnumber;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;

	@FindBy(xpath = "//input[@placeholder='Search Name or Number or Mail']")
	WebElement search;

	@FindBy(xpath = "//a[normalize-space()='Prasanth']")
	WebElement name;

	@FindBy(xpath = "//b[normalize-space()='Inventory']")
	WebElement inventory;

	@FindBy(xpath = "//div[@id='item_2145']//img[@alt='Products']")
	WebElement product;

	@FindBy(xpath = ".//div[@id='prods']/div")
	List<WebElement> prods;

	@FindBy(xpath = "//a[@class='common-btn']")
	WebElement addtocart;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement cartyes;

	@FindBy(xpath = "//i[@class='bx bxs-cart']")
	WebElement cart;

	@FindBy(xpath = "//button[@class='btn btn-primary']")
	WebElement createquote;

	@FindBy(xpath = "//h2[@id='flush-headingOne_1489']//button[@type='button']")
	WebElement open;

	@FindBy(xpath = "//*[@id=\"flush-collapseOne_1490\"]/div/table[2]/tbody/tr/td/div/div[1]/form/input[1]")
	WebElement adddiscount;

	@FindBy(xpath = "//div[@class='nice-select form-control open']//li[@class='option'][normalize-space()='1']")
	WebElement WQty;

	@FindBy(xpath = "//a[@class='btn btn-outline-primary']")
	WebElement submitforpayment;

	@FindBy(xpath = "//div[@class='products-thumb']//span[contains(text(),'Showpieces & Idols')]")
	WebElement showpieces;

	@FindBy(xpath = ".//button[@type='button']")
	WebElement clickbutton;

	@FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(1)")
	WebElement deliverycharges;

	@FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(2) > input:nth-child(3)")
	WebElement value;

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")
	WebElement createsalesorder;

	@FindBy(xpath = "	//a[@class='btn btn-outline-primary']")
	WebElement submit;

	@FindBy(xpath = "//a[@class='dropdown-toggle join']")
	WebElement clickdrop;

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement clickLogout;

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;

	@FindBy(xpath = "//span[normalize-space()='Sales']")
	WebElement sales;

	@FindBy(xpath = "//a[normalize-space()='Open Sale Orders']")
	WebElement opensalesorder;

	@FindBy(xpath = "//a[normalize-space()='Next']")
	WebElement next;

	@FindBy(xpath = "//table[@class='col-md-12']")
	List<WebElement> tablerows;

	@FindBy(xpath = ".//strong[text()='Prasanth']")
	WebElement rowname;

	@FindBy(xpath = "//div[@id='collapse_339']//input[@placeholder='Remarks']")
	WebElement remarks;

	@FindBy(xpath = "//div[@id='collapse_339']//button[@type='submit'][normalize-space()='Create DC']")
	WebElement createDC;

	@FindBy(xpath = "//span[normalize-space()='Dispatch']")
	WebElement dispatch;

	@FindBy(xpath = "//a[normalize-space()='Ready to Dispatch']")
	WebElement readytodispatch;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement searchname;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement dispatchto;

	@FindBy(xpath = "//input[@value='true']")
	WebElement checkbox;

	@FindBy(xpath = "//input[@id='EwayBillDetails']")
	WebElement ewaybillnumber;

	@FindBy(xpath = "//input[@id='CustGstNumber']")
	WebElement custgstnum;

	@FindBy(xpath = "//input[@id='DespatchedOn']")
	WebElement calendar;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	WebElement update;

	@FindBy(xpath = "//a[normalize-space()='Dispatched']")
	WebElement dispatched;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement printinvoice;

	public EndToEndFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void customerregister() throws Throwable {

		selectcustomer.click();
		Thread.sleep(3000);

		Utils.scroll();
		Thread.sleep(3000);

		register.click();
		Thread.sleep(2000);

		fullname.sendKeys(prop.getProperty("FullName"));
		mobilenumber.sendKeys(prop.getProperty("Mobilenum"));
		email.sendKeys(prop.getProperty("Email"));
		whatsappnumber.sendKeys(prop.getProperty("Mobilenum"));
		Thread.sleep(2000);

		Utils.scroll();
		Thread.sleep(3000);

		savebutton.click();

		search.sendKeys(prop.getProperty("FullName"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		name.click();
		Thread.sleep(2000);
	}

	public void verifysalesexecutiveaddcustomer(int prodsIndex) throws Throwable {

		selectcustomer.click();
		Thread.sleep(3000);

		search.sendKeys(prop.getProperty("FullName"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		name.click();
		Thread.sleep(2000);

		inventory.click();
		Thread.sleep(2000);

		Utils.scroll();

		Thread.sleep(3000);

		showpieces.click();
		Thread.sleep(2000);

		if (prodsIndex >= 0 && prodsIndex < prods.size()) {
			prods.get(prodsIndex).click();
		}

		String parentid = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();

		for (String windowids : ids) {
			System.out.println(windowids);

			if (!parentid.equals(windowids)) {
				driver.switchTo().window(windowids);

			}

		}

		Thread.sleep(2000);
		Utils.scroll();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement addToCartButton = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='common-btn']")));

		addToCartButton.click();
		Thread.sleep(2000);

		cartyes.click();
		Thread.sleep(2000);

		cart.click();
		Thread.sleep(2000);

		createquote.click();
		Thread.sleep(2000);

		clickbutton.click();

		Utils.scroll();
		Thread.sleep(2000);

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
				"body > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > table:nth-child(2) > tbody:nth-child(1) > tr:nth-child(1) > td:nth-child(1) > table:nth-child(1) > tbody:nth-child(2) > tr:nth-child(1) > td:nth-child(3) > div:nth-child(2)")));
		element.click();

		WQty.click();
		Thread.sleep(2000);

		deliverycharges.sendKeys(prop.getProperty("DeliveryCharge"));
		Thread.sleep(2000);

		value.sendKeys(prop.getProperty("RoundOfValue"));
		Thread.sleep(2000);

		createsalesorder.click();
		Thread.sleep(2000);

		clickbutton.click();

		Utils.scroll();

		submitforpayment.click();
		Thread.sleep(2000);

		clickdrop.click();
		Thread.sleep(2000);

		clickLogout.click();

	}

	public void verifysalesorderdispatch() throws Throwable {

		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		sales.click();
		Thread.sleep(2000);
		opensalesorder.click();
		Thread.sleep(3000);
		next.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		next.click();
		Thread.sleep(2000);
		rowname.click();

		Utils.scroll();

		Thread.sleep(2000);
		remarks.click();
		remarks.sendKeys(prop.getProperty("Remarks"));

		Thread.sleep(2000);

		createDC.click();

		dispatch.click();
		Thread.sleep(2000);
		readytodispatch.click();
		Thread.sleep(2000);
		searchname.sendKeys(prop.getProperty("dispatchname"));
		Thread.sleep(2000);
		dispatchto.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		checkbox.click();
		Thread.sleep(2000);
		ewaybillnumber.sendKeys(prop.getProperty("Billnum"));
		Thread.sleep(2000);
		custgstnum.sendKeys(prop.getProperty("GSTnum"));
		Thread.sleep(2000);
		calendar.sendKeys(prop.getProperty("Calendarin"));
		calendar.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		update.click();

		Thread.sleep(2000);
		element.click();
		Thread.sleep(2000);
		dispatch.click();
		Thread.sleep(2000);
		dispatched.click();
		Thread.sleep(2000);
		searchname.sendKeys(prop.getProperty("dispatchname"));
		Thread.sleep(2000);
		printinvoice.click();

	}

}
