package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class LoginPage extends StepBase{
	
	UtilityClass objUtilityClass = new UtilityClass();

	@FindBy(xpath = "//*[@name='username']")
	WebElement userName;
	
	@FindBy(xpath = "//*[@type='password']")
	WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() {
		String user = "Admin";
//		userName.sendKeys("Admin");
//		password.sendKeys("admin123");
//		loginBtn.click();
		
		objUtilityClass.sendKeysWebElements(userName, user);
		objUtilityClass.sendKeysWebElements(password, "admin123");
		objUtilityClass.clickOnWebElement(loginBtn, 10);
	}
	
}
