package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMAccount;
import POMPackage.POMLoginSecurityModule;
import POMPackage.POMOrdersModule;

public class TestOrdersModule extends BaseClass {

POMAccount useraccount;
POMOrdersModule orders;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		useraccount = new POMAccount();
		orders = new POMOrdersModule();
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
	public void orders() throws InterruptedException {
		
		orders.clickOrders();
		orders.buyagain();
		orders.notyetshipped();
		orders.cancelledorders();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Orders")));
		orders.orders();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void AfterMethod() {
		driver.close();
}
}
