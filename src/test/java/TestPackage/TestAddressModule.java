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
import POMPackage.POMAddressModule;

public class TestAddressModule extends BaseClass{

	POMAddressModule address;
	POMAccount useraccount;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		useraccount = new POMAccount();
		address = new POMAddressModule();
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
		
		address.clickAddress();
		address.clickAddAddress();
	}
	
	@Test (priority=1)
	public void addvalidAddress() throws InterruptedException {
		
		/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#address-ui-widgets-countryCode-dropdown-nativeId")));
		
		Select obj = new Select(driver.findElement(By.cssSelector("#address-ui-widgets-countryCode-dropdown-nativeId")));
		obj.selectByVisibleText("Canada");*/
		address.addcountry();
		address.addname("abcd");
		address.addaddress1("222");
		address.addaddress2("abc drive");
		address.addcity("xyz");
		
		/*WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(50));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")));
		
		Select obj1 = new Select(driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")));
		obj1.selectByVisibleText("Ontario");*/
		address.addprovince();
		address.addpostalcode("xyz123");
		address.addphoneno("999933333");
		address.defaultAddress();
		address.saveAddress();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
}
}
