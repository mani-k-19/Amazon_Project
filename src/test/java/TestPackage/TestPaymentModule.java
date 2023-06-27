package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMAccount;
import POMPackage.POMLoginSecurityModule;
import POMPackage.POMPaymentModule;

public class TestPaymentModule extends BaseClass {

POMLoginSecurityModule editinfo;
POMAccount useraccount;
POMPaymentModule payment;
WebElement expmonth;
WebElement expyear;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		useraccount = new POMAccount();
		editinfo = new POMLoginSecurityModule();
		payment = new POMPaymentModule();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	@BeforeMethod  
	public void signin() {
		useraccount.typeEmail(prop.getProperty("validemail"));
		useraccount.clickContinue();
		useraccount.typePassword(prop.getProperty("validpassword"));
		useraccount.checkRememberMe();
		useraccount.clickSubmit();
		
		useraccount.clickUsername();
	}
	
	@Test (priority=1)
	public void addpaymentmethod() throws InterruptedException {
		
		payment.clickPayment();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add a payment method")));
		payment.addPayment();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("apx-add-credit-card-action-test-id")));
		payment.addcard();
		payment.addcardno("8349340934");
		payment.addcardname("abc");
		payment.addexpmonth();
		payment.addexpyear();
		payment.addcvv("123");
		payment.savecard();
		Thread.sleep(2000);
	}
	@AfterMethod
	public void AfterMethod() {
		driver.close();
}
}
