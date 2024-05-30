package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.ExcelReader;

public class BasePage {
	WebDriver driver;
	ExcelReader excelReader = new ExcelReader("TestData\\TF_TestData.xlsx");
	protected String userName = excelReader.getCellData("LoginInfo", "UserName", 2);
	protected String password = excelReader.getCellData("LoginInfo", "Password", 2);
	protected String expectedAlertUserNameText = excelReader.getCellData("LoginInfo", "alertUserValidationText", 2);
	protected String expectedAlertPasswordText= excelReader.getCellData("LoginInfo", "alertPasswordValidationText", 2);
	

	public void selectFromDropdown(WebElement element, String visibleText) {
		Select select = new Select(element);
				select.selectByVisibleText(visibleText);
	}
	public int generateRandonNumber(int boundary) {
		Random random = new Random();
		int randomNum =random.nextInt(boundary);
		return randomNum;
	}

}
