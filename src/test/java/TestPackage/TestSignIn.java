package TestPackage;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMSignIn;


public class TestSignIn extends BaseClass {

POMSignIn signin;
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		signin = new POMSignIn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Test
	public void validEmail() throws InterruptedException {

		signin.typeEmail(prop.getProperty("validemail"));
		signin.clickContinue();
		Thread.sleep(2000);
	}
	@Test
	public void invalidEmail() throws InterruptedException {

		signin.typeEmail(prop.getProperty("invalidemail"));
		signin.clickContinue();
		Thread.sleep(2000);
	}
	@Test
	public void blankEmail() throws InterruptedException {

		signin.typeEmail(prop.getProperty(""));
		signin.clickContinue();
		Thread.sleep(2000);
	}
	@Test
	public void invalidPassword() throws InterruptedException {

		signin.typeEmail(prop.getProperty("validemail"));
		signin.clickContinue();
		signin.typePassword(prop.getProperty("invalidpassword"));
		signin.clickSubmit();
		Thread.sleep(2000);
	}
	@Test
	public void blankPassword() throws InterruptedException {

		signin.typeEmail(prop.getProperty("validemail"));
		signin.clickContinue();
		signin.typePassword(prop.getProperty(""));
		signin.clickSubmit();
		Thread.sleep(2000);
	}
	@Test
	public void signinCheck() throws InterruptedException {

		signin.typeEmail(prop.getProperty("validemail"));
		signin.clickContinue();
		signin.typePassword(prop.getProperty("validpassword"));
		signin.checkRememberMe();
		signin.clickSubmit();
		Thread.sleep(2000);
	}
}
