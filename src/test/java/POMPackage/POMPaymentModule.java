package POMPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BasePackage.BaseClass;

public class POMPaymentModule extends BaseClass {

    @FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2") WebElement payment;
	@FindBy(linkText="Add a payment method") WebElement clickpayment;
	@FindBy(id="apx-add-credit-card-action-test-id") WebElement clickcard;
	@FindBy(xpath="//*[@id=\"pp-qrc2GQ-16\"]") WebElement cardno;
	@FindBy(xpath="//*[@id=\"pp-qrc2GQ-18\"]") WebElement cardname;
	@FindBy(id="pp-qrc2GQ-19") WebElement expmonth;
	@FindBy(id="pp-qrc2GQ-21") WebElement expyear;
	@FindBy(xpath="//*[@id=\"pp-qrc2GQ-25\"]") WebElement cvv;
	@FindBy(xpath="//*[@id=\"pp-qrc2GQ-31\"]/span/input") WebElement savecard;
	
	
	public POMPaymentModule() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickPayment() {
		payment.click();
	}
	
	public void addPayment() {
		
		clickpayment.click();
	}
	public void addcard() {
		
		clickcard.click();
	}
	
	public void addcardno(String cardnumber) {
		
		cardno.sendKeys(cardnumber);
	}
    public void addexpmonth() {
		
    	Select obj = new Select(expmonth);
		obj.selectByVisibleText("05");
	}
   public void addexpyear() {
		
	    Select obj1 = new Select(expyear);
	    obj1.selectByVisibleText("2025");
	}
   public void addcardname(String name) {
	
	    cardname.sendKeys(name);
    }
    public void addcvv(String code) {
		
		cvv.sendKeys(code);
	}
    public void savecard() {
		
		savecard.click();
	}
}
