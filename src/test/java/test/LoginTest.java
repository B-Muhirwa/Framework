package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest extends BasePage {
	WebDriver driver;

	@Test
	public void ValidUserShouldBeAbleToLogin() {
	    driver = BrowserFactory.init();
		
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.getLoginPageValidation();
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigniInButton();
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
	
	
		BrowserFactory.tearDown();
	
		
	}
	@Test(priority =2)
	public void validateAlertPopUpMsgs()  {
		driver = BrowserFactory.init();
		LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
		loginPage.validateUserNameAlertPopUpMsg();
		loginPage.validatePasswordAlertPopUpMsg();
		
	
		
		
	}

}
