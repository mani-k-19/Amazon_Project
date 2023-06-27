package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class POMAccount extends BaseClass {

	@FindBy(id="ap_email") WebElement email;
	@FindBy(id="continue") WebElement continueButton;
	@FindBy(id="ap_password") WebElement password;
	@FindBy(id="signInSubmit") WebElement submitButton;
	@FindBy(name="rememberMe") WebElement rememberMeCheck;
	@FindBy(css="#nav-link-accountList-nav-line-1") WebElement username;
	
	public POMAccount() {
		PageFactory.initElements(driver,this);
	}

	public void typeEmail(String userEmail) {
		email.sendKeys(userEmail);
	}
	public void clickContinue() {
		continueButton.click();
	}
	public void typePassword(String userPassword) {
		password.sendKeys(userPassword);
	}
	public void checkRememberMe() {
		rememberMeCheck.click();
	}
	public void clickSubmit() {
		submitButton.click();
	}
	public boolean displayUsername() {
		boolean a = username.isDisplayed();
		return a;
	}
	public void clickUsername() {
		username.click();
	}
}
