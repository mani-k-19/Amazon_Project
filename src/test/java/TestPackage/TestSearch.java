package TestPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BasePackage.BaseClass;
import POMPackage.POMAccount;
import POMPackage.POMSearch;

public class TestSearch extends BaseClass {

	POMAccount useraccount;
	POMSearch search;
	SoftAssert s;
		
		@BeforeMethod  
		public void initialsetup() {
			initiate();
			useraccount = new POMAccount();
			search = new POMSearch();
			s = new SoftAssert();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
		
		@BeforeMethod  
		public void signin() {
			useraccount.typeEmail(prop.getProperty("validemail"));
			useraccount.clickContinue();
			useraccount.typePassword(prop.getProperty("validpassword"));
			useraccount.checkRememberMe();
			useraccount.clickSubmit();
		}
		
		@Test (priority=1)
		public void searchitem() throws InterruptedException {
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			search.search("T-shirts");
			boolean a = search.displaysort();
			System.out.println(a);
			boolean b = search.displayfilter();
			System.out.println(b);
			boolean c = search.displayfilters();
			System.out.println(c);
			boolean d = search.displaypagination();
			System.out.println(d);
			/*WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#s-result-sort-select")));*/
			search.sort();
			Thread.sleep(2000);
			search.filter();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/a[3]")));
			search.nextpage1();
			System.out.println("Next Page");
			s.assertAll();
			search.nextpage();
			System.out.println("Page 2");
			s.assertAll();
			Thread.sleep(2000);
		}
		@AfterMethod
		public void AfterMethod() {
			driver.close();
	}
}
