package TestPackage;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMAccount;

public class TestAccount extends BaseClass {

POMAccount useraccount;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		useraccount = new POMAccount();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	@BeforeMethod  
	public void signin() {
		useraccount.typeEmail(prop.getProperty("validemail"));
		useraccount.clickContinue();
		useraccount.typePassword(prop.getProperty("validpassword"));
		useraccount.checkRememberMe();
		useraccount.clickSubmit();
	}
	
	@Test (priority=1)
	public void userAccount() throws InterruptedException {
		
		boolean a = useraccount.displayUsername();
		System.out.println(a);
		
		useraccount.clickUsername();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
}

}
