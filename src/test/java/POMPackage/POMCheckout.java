package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class POMCheckout extends BaseClass{

	@FindBy(xpath="//*[@id=\"nav-cart\"]") WebElement cartIcon;
	@FindBy(xpath="//*[@id=\"sc-buy-box-ptc-button\"]/span/input") WebElement checkout;
	@FindBy(xpath="//*[@id=\"address-list\"]/div/div[1]/div/fieldset[1]/div[1]/span/div/label/input") WebElement selectaddress;
	@FindBy(id="shipToThisAddressButton") WebElement shipaddress;
	
	

	public POMCheckout() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickcarticon() {
		cartIcon.click();
	}
	public void proceedcheckout() {
		checkout.click();
	}
	public void selectaddress() {
		selectaddress.isSelected();
	}
	public void shiptoaddress() {
		shipaddress.click();
	}
}
