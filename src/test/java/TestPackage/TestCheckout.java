package TestPackage;

import java.time.Duration;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMAccount;
import POMPackage.POMCheckout;

public class TestCheckout extends BaseClass {
	
	POMAccount useraccount;
	POMCheckout checkout;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		useraccount = new POMAccount();
		checkout = new POMCheckout();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	
	@BeforeMethod  
	public void signin() {
		useraccount.typeEmail(prop.getProperty("validemail"));
		useraccount.clickContinue();
		useraccount.typePassword(prop.getProperty("validpassword"));
		useraccount.checkRememberMe();
		useraccount.clickSubmit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	@Test (priority=1)
	public void restorecart() throws InterruptedException {
		
		checkout.clickcarticon();
		checkout.proceedcheckout();
		checkout.selectaddress();
		checkout.shiptoaddress();
	    Thread.sleep(2000);
}
	@AfterMethod
	public void AfterMethod() {
		driver.close();
}
}
