package TestPackage;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMSignUp;

public class TestSignUp extends BaseClass {
	
	POMSignUp signup;
	
	public TestSignUp() {
		super();
	}
	
	@BeforeMethod  
	public void initialsetup() {
		initiate();
		signup = new POMSignUp();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}

	@Test
	public void blankName() throws InterruptedException {

		signup.typeName(prop.getProperty(""));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void blankEmail() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty(""));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void verifyValid() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		
		Thread.sleep(2000);
	}
	@Test
	public void verifyInvalid() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("invalidemail"));
		
		Thread.sleep(2000);
	}
	@Test
	public void invalidEmail() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("invalidemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void invalidPassword() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("invalidpassword"));
		signup.typePasswordAgain(prop.getProperty("invalidpassword"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void blankPassword() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty(""));
		signup.typePasswordAgain(prop.getProperty(""));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void invalidPasswordAgain() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("invalidpasswordcheck"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void validPassword() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void existingCustomer() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		Thread.sleep(2000);
	}
	@Test
	public void invalidOTP() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		
		Thread.sleep(2000);
	}
	@Test
	public void validOTP() throws InterruptedException {

		signup.typeName(prop.getProperty("name"));
		signup.typeEmail(prop.getProperty("validemail"));
		signup.typePassword(prop.getProperty("validpassword"));
		signup.typePasswordAgain(prop.getProperty("validpassword"));
		signup.clickButton();
		
		Thread.sleep(2000);
	}
}
