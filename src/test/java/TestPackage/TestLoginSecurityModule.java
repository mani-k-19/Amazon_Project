package TestPackage;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMAccount;
import POMPackage.POMLoginSecurityModule;


public class TestLoginSecurityModule extends BaseClass {

POMLoginSecurityModule editinfo;
POMAccount useraccount;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		useraccount = new POMAccount();
		editinfo = new POMLoginSecurityModule();
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
		
		editinfo.clickLoginSecurity();
	}
	
	@Test (priority=1)
	public void editName() throws InterruptedException {
		
		editinfo.editName("abcd");
		Thread.sleep(2000);
	}
	@Test (priority=2)
	public void editEmail() throws InterruptedException {
		
		editinfo.editEmail("abctest@gmail.com");
		Thread.sleep(2000);
	}
	@Test (priority=3)
	public void editPassword() throws InterruptedException {
		
		editinfo.editPassword(prop.getProperty("validpassword"), "abcd");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
}
}
