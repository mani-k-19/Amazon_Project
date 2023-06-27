package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class POMOrdersModule extends BaseClass {

    @FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement clickOrders;
    @FindBy(linkText="Orders") WebElement orders;
	@FindBy(linkText="Buy Again") WebElement buyagain;
	@FindBy(linkText="Not Yet Shipped") WebElement notyetshipped;
	@FindBy(linkText="Cancelled Orders") WebElement cancelledorders;
	
	public POMOrdersModule() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOrders() {
		clickOrders.click();
	}
	
	public void orders() {
		orders.click();
	}
	
	public void buyagain() {
		buyagain.click();
	}
	
	public void notyetshipped() {
		notyetshipped.click();
	}
	
	public void cancelledorders() {
		cancelledorders.click();
	}
}
