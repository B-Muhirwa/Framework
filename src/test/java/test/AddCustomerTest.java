package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest extends BasePage{
	WebDriver driver;
	ExcelReader excelReader = new ExcelReader("TestData\\TF_TestData.xlsx");
	String fullname = excelReader.getCellData("AddContactInfo", "FullName", 2);
	String company = excelReader.getCellData("AddContactInfo", "CompanyName", 2);
	String Country = excelReader.getCellData("AddContactInfo", "Country", 2);
	String email = excelReader.getCellData("AddContactInfo", "Email", 2);
	String phone = excelReader.getCellData("AddContactInfo", "Phone", 2);
	String address = excelReader.getCellData("AddContactInfo", "Address", 2);
	String city = excelReader.getCellData("AddContactInfo", "City", 2);
	String zipcode = excelReader.getCellData("AddContactInfo", "Zip", 2);
	String group = excelReader.getCellData("AddContactInfo", "Group", 2);
	
	@Test
	public void addNewCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickOnSigniInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.clickOnCustomersMenu();
		dashboardPage.clickOnAddCustomer();
		
		AddCustomerPage addCustomer = PageFactory.initElements(driver, AddCustomerPage.class);
		addCustomer.validateCustomerPage();
		addCustomer.insertFullName(fullname);
		addCustomer.selectCompanyNameFromDropdown(company);
		addCustomer.insertEmail(email);
		addCustomer.insertPhoneNumber(phone);
		addCustomer.insertAddress(address);
		addCustomer.insertCity(city);
		addCustomer.insertzipCode(zipcode);
		addCustomer.selectCountryFromDropdown(Country);
		addCustomer.selectGroupFromDropdown(group);
		
		BrowserFactory.tearDown();
	
	}

}
