package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
	@FindBy(how =How.XPATH,using = "/html/body/div[1]/section/div/div[2]/div/div/header/div/strong") WebElement DASHBOARD_ELEMENT;
	@FindBy(how =How.XPATH, using= "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span") WebElement CUSTOMERS_MENU_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"customers\"]/li[2]/a/span") WebElement ADD_CUSTOMERS_ELEMENT;
	
	public void clickOnCustomersMenu() {
		CUSTOMERS_MENU_ELEMENT.click();
	}
	public void clickOnAddCustomer() {
		ADD_CUSTOMERS_ELEMENT.click();
	}
	public String validateDashboardPage() {
		String actualElement = DASHBOARD_ELEMENT.getText();
		Assert.assertEquals(actualElement, "Dashboard", "Dashboard Page Not Found");
		System.out.println(actualElement);
		return actualElement;
	}

}
