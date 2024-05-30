package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomerPage extends BasePage {
	
	
	@FindBy(how =How.XPATH, using= "/html/body/div[1]/section/div/div[2]/div/div[1]/div[1]/div/div/header/div/strong") WebElement NEW_CUSTOMER_PAGE_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"general_compnay\"]/div[1]/div/input") WebElement FULL_NAME_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"general_compnay\"]/div[2]/div/select") WebElement COMPANY_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"general_compnay\"]/div[3]/div/input") WebElement EMAIL_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"general_compnay\"]/div[5]/div/input") WebElement ADDRESS_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"general_compnay\"]/div[6]/div/input") WebElement CITY_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"port\"]") WebElement ZIPCODE_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"general_compnay\"]/div[8]/div[1]/select") WebElement COUNTRY_ELEMENT;
	@FindBy(how =How.XPATH, using= "//*[@id=\"customer_group\"]") WebElement GROUP_ELEMENT;
	
	public String validateCustomerPage() {
		String ActualElement =NEW_CUSTOMER_PAGE_ELEMENT.getText();
		Assert.assertEquals(ActualElement, "New Customer", "New Customer Page Not Found");
		return ActualElement;
	}
	public void insertFullName(String fullName) {
		String name = fullName +generateRandonNumber(99);
		FULL_NAME_ELEMENT.sendKeys(name);
		
	}
	public void selectCompanyNameFromDropdown(String company) {
		selectFromDropdown(COMPANY_ELEMENT, company);
		
	}
	public void insertEmail(String email) {
		
		EMAIL_ELEMENT.sendKeys(generateRandonNumber(99)+ email);
	}
	public void insertPhoneNumber(String phone) {
		PHONE_ELEMENT.sendKeys(phone);
		
	}
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
	public void insertzipCode(String zipcode) {
		ZIPCODE_ELEMENT.sendKeys(zipcode);
	}
	public void selectCountryFromDropdown(String country) {
		selectFromDropdown(COUNTRY_ELEMENT, country);
	}
	public void selectGroupFromDropdown(String group) {
		selectFromDropdown(GROUP_ELEMENT, group);
	}
		
		
	

}
