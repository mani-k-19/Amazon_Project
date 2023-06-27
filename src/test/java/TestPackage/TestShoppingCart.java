package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import POMPackage.POMAccount;
import POMPackage.POMShoppingCart;

public class TestShoppingCart extends BaseClass {

	POMAccount useraccount;
	POMShoppingCart shopping;
		
		@BeforeMethod  
		public void initialsetup() {
			initiate();
			useraccount = new POMAccount();
			shopping = new POMShoppingCart();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
		
		@BeforeMethod  
		public void signin() {
			useraccount.typeEmail(prop.getProperty("validemail"));
			useraccount.clickContinue();
			useraccount.typePassword(prop.getProperty("validpassword"));
			useraccount.checkRememberMe();
			useraccount.clickSubmit();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
		
		@Test (priority=1)
		public void additem() throws InterruptedException {
			
			driver.get("https://www.amazon.ca/gp/product/B08F7KZ7YT/ref=ox_sc_act_title_1?smid=A1HF1XCXM241FA&psc=1");
			shopping.addtocartBtn();
			shopping.gotocartBtn();
			Thread.sleep(2000);
			
			driver.get("https://www.amazon.ca/gp/product/B08F7KZ7YT/ref=ox_sc_act_title_1?smid=A1HF1XCXM241FA&psc=1");
			shopping.addtocartBtn();
			shopping.gotocartBtn();
			Thread.sleep(2000);
			
			driver.get("https://www.amazon.ca/gp/product/B09ZB66L28/ref=ox_sc_act_title_1?smid=A2YUFNZCTK4USK&psc=1");
			shopping.addtocartBtn();
			shopping.gotocartBtn();
			Thread.sleep(2000);
			
			shopping.updateitems();
			shopping.deleteitem();
			shopping.deleteitems();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("        HAVANSIDY Women's Maxi Dresses Casual Side Split Loose Cover up Tank T-Shirt Dresses with Pockets       ")));
			shopping.producttitle();
			
			driver.close();
			
		}
		
		@Test (priority=2)
		public void restorecart() throws InterruptedException {
			
		shopping.clickcarticon();
		Thread.sleep(2000);
	}
		@AfterMethod
		public void AfterMethod() {
			driver.close();
	}
		
			/*@Test (priority=2)
			public void additems() throws InterruptedException {
				
			driver.get("https://www.amazon.ca/gp/product/B08F7KZ7YT/ref=ox_sc_act_title_1?smid=A1HF1XCXM241FA&psc=1");
			shopping.addtocartBtn();
			shopping.gotocartBtn();
			Thread.sleep(2000);
		}
			@Test (priority=3)
			public void addmultipleitems() throws InterruptedException {
				
			driver.get("https://www.amazon.ca/gp/product/B09ZB66L28/ref=ox_sc_act_title_1?smid=A2YUFNZCTK4USK&psc=1");
			shopping.addtocartBtn();
			shopping.gotocartBtn();
			Thread.sleep(2000);
			driver.close();
		}
			@Test (priority=4)
			public void restorecart() throws InterruptedException {
				
			initialsetup();
			signin();
			shopping.clickcarticon();
			Thread.sleep(2000);
		}
			@Test (priority=5)
			public void updatecart() throws InterruptedException {
			shopping.updateitems();
			shopping.deleteitem();
			shopping.deleteitems();
			shopping.producttitle();
		}*/
		}
