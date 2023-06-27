package POMPackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class POMSearch extends BaseClass {

	@FindBy(css="#twotabsearchtextbox") WebElement searchbox;
	@FindBy(css="#s-result-sort-select") WebElement sortby;
	@FindBy(css="#p_36\\/12035761011 > span > a > span") WebElement filter1;
	@FindBy(css="#p_n_feature_twenty_browse-bin\\/31847698011 > span > a > span") WebElement filter2;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[51]/div") WebElement pagination;
	@FindBy(xpath="//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[1]/div[1]/div[51]/div/div/span/a[1]") WebElement nextpage;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/a[3]") WebElement nextpage1;
	

	public POMSearch() {
		PageFactory.initElements(driver,this);
	}
	
	public void search(String searchquery) {
		searchbox.sendKeys(searchquery);
		searchbox.submit();
	}
	public Boolean displaysort() {
		boolean result1 = sortby.isDisplayed();
		return result1;
	}
		public Boolean displayfilter() {
		boolean result2 = filter1.isDisplayed();
		return result2;
	}
		public Boolean displayfilters() {
		boolean result3 = filter2.isDisplayed();
		return result3;
	}
		public Boolean displaypagination() {
		boolean result4 = pagination.isDisplayed();
		return result4;
	}
	public void sort() {
		Select obj1 = new Select(sortby);
		obj1.selectByVisibleText("Price: Low to high");
		/*Select obj2 = new Select(sortby);
		obj2.selectByVisibleText("Price: High to low");
		Select obj3 = new Select(sortby);
		obj3.selectByVisibleText("Avg. customer review");
		Select obj4 = new Select(sortby);
		obj4.selectByVisibleText("Newest arrivals");
		Select obj5 = new Select(sortby);
		obj5.selectByVisibleText("Featured");*/
	}
	public void filter() {
		filter1.click();
		filter2.click();
	}
	public void nextpage() {
		nextpage.click();
	}
	public void nextpage1() {
		nextpage1.click();
	}
}
