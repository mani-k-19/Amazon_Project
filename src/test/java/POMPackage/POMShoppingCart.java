package POMPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class POMShoppingCart extends BaseClass {

@FindBy(xpath="//*[@id=\"add-to-cart-button\"]") WebElement addtocartBtn;
@FindBy(css="#sw-gtc > span > a") WebElement gotocartBtn;
@FindBy(xpath="//*[@id=\"quantity\"]") WebElement updateItems;
@FindBy(xpath="//*[@id=\"sc-active-Caa35e645-513f-4a73-8ef1-de799a93d3c3\"]/div[4]/div/div[3]/div[1]/span[2]/span/input") WebElement deleteItem;
@FindBy(xpath="//*[@id=\"sc-active-Caa35e645-513f-4a73-8ef1-de799a93d3c3\"]/div[4]/div/div[1]/label/input") WebElement chkItems;
@FindBy(linkText="        HAVANSIDY Women's Maxi Dresses Casual Side Split Loose Cover up Tank T-Shirt Dresses with Pockets       ") WebElement productTitle;
@FindBy(xpath="//*[@id=\"nav-cart\"]") WebElement cartIcon;

	public POMShoppingCart() {
		PageFactory.initElements(driver,this);
	}
	
	public void addtocartBtn() {
		addtocartBtn.click();
	}
	
	public void gotocartBtn() {
		gotocartBtn.click();
	}
	public void clickcarticon() {
		cartIcon.click();
	}
	public void updateitems() {
		Select obj = new Select(updateItems);
		obj.selectByVisibleText("3");
	}
	public void deleteitem() {
		deleteItem.click();
	}
	public void deleteitems() {
		chkItems.click();
		/*deleteItem.click();*/
	}
	public void producttitle() {
		productTitle.click();
	}
}
