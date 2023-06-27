package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class POMSignUp extends BaseClass {

	@FindBy(id="ap_customer_name") WebElement name;
	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="ap_password_check") WebElement passwordcheck;
	@FindBy(id="continue") WebElement continueButton;
	
	public POMSignUp() {
		PageFactory.initElements(driver,this);
	}

	public void typeName(String userName) {
		name.sendKeys(userName);
	}
	public void typeEmail(String userEmail) {
		email.sendKeys(userEmail);
	}
	public void typePassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	public void typePasswordAgain(String passwordAgain) {
		passwordcheck.sendKeys(passwordAgain);
	}
	public void clickButton() {
		continueButton.click();
	}
	
}
