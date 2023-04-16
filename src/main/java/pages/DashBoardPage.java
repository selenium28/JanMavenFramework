package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.StepBase;
import utility.UtilityClass;

public class DashBoardPage extends StepBase{
	
	UtilityClass objUtilityClass = new UtilityClass();
	
	@FindBy(xpath = "(//*[text()='PIM'])[1]")
	WebElement pimButton;
	
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPIMButton() {
		objUtilityClass.clickOnWebElement(pimButton, 10);
	}

}
