package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage{
	WebDriver driver;
	
	@FindBy(how =How.XPATH , using = "//*[@id=\"user_name\"]") WebElement USER_NAME_ELEMENT;
	@FindBy(how =How.XPATH , using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how =How.XPATH , using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON_ELEMENT;
	@FindBy(how =How.XPATH, using = "/html/body/div/div/div[3]/div[1]/a/span") WebElement LOGIN_PAGE_ELEMENT;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	public void getLoginPageValidation() {
		String actualElement = LOGIN_PAGE_ELEMENT.getText();
		Assert.assertEquals(actualElement, "Codefios", "Page Not Found");
		
	}
	public void insertUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}
	public void insertPassword(String password) {
		 PASSWORD_ELEMENT.sendKeys(password);
	}
	public void clickOnSigniInButton() {
		SIGNIN_BUTTON_ELEMENT.click();
	}
	public String validateUserNameAlertPopUpMsg()  {
		SIGNIN_BUTTON_ELEMENT.click();
		String ActualUserNameAlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(ActualUserNameAlertMessage,  expectedAlertUserNameText, "UserName Alert Message  Mismatch");
		System.out.println(ActualUserNameAlertMessage);
		driver.switchTo().alert().accept();
		return ActualUserNameAlertMessage;
		
	}
	public String validatePasswordAlertPopUpMsg() {
		USER_NAME_ELEMENT.sendKeys(userName);
		SIGNIN_BUTTON_ELEMENT.click();
		String ActualPasswordAlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(ActualPasswordAlertMessage,  expectedAlertPasswordText, "Password Alert Message  Mismatch");
		System.out.println(ActualPasswordAlertMessage);
		return ActualPasswordAlertMessage;
	}
		

	
	

}
