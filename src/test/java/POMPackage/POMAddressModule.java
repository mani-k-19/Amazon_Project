package POMPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class POMAddressModule extends BaseClass{

	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement address;
	@FindBy(css="#ya-myab-address-add-link > div > div > h2") WebElement addAddress;
	
	@FindBy(css="#address-ui-widgets-countryCode-dropdown-nativeId") WebElement country;
	@FindBy(id="address-ui-widgets-enterAddressFullName") WebElement name;
	@FindBy(id="address-ui-widgets-enterAddressLine1") WebElement streetaddress1;
	@FindBy(id="address-ui-widgets-enterAddressLine2") WebElement streetaddress2;
	@FindBy(id="address-ui-widgets-enterAddressCity") WebElement city;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId") WebElement province;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode") WebElement postalcode;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber") WebElement phoneno;
	@FindBy(id="address-ui-widgets-use-as-my-default") WebElement defaultAddress;
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input") WebElement saveAddress;
	
	public POMAddressModule() {
		PageFactory.initElements(driver,this);
	}

	public void clickAddress() {
		address.click();
	}
	public void clickAddAddress() {
		addAddress.click();
	}
	
	public void addcountry() {
	    Select obj = new Select(country);
		obj.selectByVisibleText("Canada");
	}
	public void addname(String addname) {
		name.sendKeys(addname);
	}
	public void addaddress1(String addaddress1) {
		streetaddress1.sendKeys(addaddress1);
	}
	public void addaddress2(String addaddress2) {
		streetaddress2.sendKeys(addaddress2);
	}
	public void addcity(String addcity) {
		city.sendKeys(addcity);
	}
	public void addprovince() {
		Select obj1 = new Select(province);
		obj1.selectByVisibleText("Ontario");
	}
	public void addpostalcode(String addpostalcode) {
		postalcode.sendKeys(addpostalcode);
	}
	public void addphoneno(String addphoneno) {
		phoneno.sendKeys(addphoneno);
	}
	public void defaultAddress() {
		defaultAddress.click();
	}
	public void saveAddress() {
		saveAddress.click();
	}
}
