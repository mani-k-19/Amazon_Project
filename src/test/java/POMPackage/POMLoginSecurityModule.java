package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePackage.BaseClass;

public class POMLoginSecurityModule extends BaseClass {

	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement loginsecurity;
	
	@FindBy(id="auth-cnep-edit-name-button") WebElement editName;
	@FindBy(css="#ap_customer_name") WebElement newName;
	@FindBy(id="cnep_1C_submit_button") WebElement saveName;
	
	@FindBy(id="auth-cnep-edit-email-button") WebElement editEmail;
	@FindBy(css="#cvf-page-content > div > div > div > form > div:nth-child(6) > div > div.a-row.a-grid-vertical-align.a-grid-center > div > input") WebElement newEmail;
	@FindBy(css="#a-autoid-0 > span > input") WebElement continueEmail;
	@FindBy(css="#cvf-page-content > div > div > form > div.a-row > div:nth-child(5) > input") WebElement enterOTP;
	@FindBy(css="#a-autoid-0 > span > input") WebElement continueOTP;
	@FindBy(id="") WebElement saveEmail;
	
	@FindBy(id="auth-cnep-edit-password-button") WebElement editPassword;
	@FindBy(id="ap_password") WebElement oldPassword;
	@FindBy(id="ap_password_new") WebElement newPassword;
	@FindBy(id="ap_password_new_check") WebElement rePassword;
	@FindBy(id="cnep_1D_submit_button") WebElement savePassword;
	
	public POMLoginSecurityModule() {
		PageFactory.initElements(driver,this);
	}

	public void clickLoginSecurity() {
		loginsecurity.click();
	}
	
	public void editName(String editname) {
		editName.click();
		newName.clear();
		newName.sendKeys(editname);
		saveName.click();
	}
	public void editEmail(String editemail) {
		editEmail.click();
		newEmail.sendKeys(editemail);
		continueEmail.click();
		enterOTP.sendKeys("");
		continueOTP.click();
		saveEmail.click();
	}
	public void editPassword(String oldpwd, String newpwd) {
		editPassword.click();
		oldPassword.sendKeys(oldpwd);
		newPassword.sendKeys(newpwd);
		rePassword.sendKeys(newpwd);
		savePassword.click();
	}
	 
}
