package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;

public class LoginPage extends StepBase{

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
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginBtn.click();
	}
	
}
