package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.StepBase;

public class UtilityClass extends StepBase{
	
	public void clickOnWebElement(WebElement element, long waitTimeInSeconds) {
		WebDriverWait webWait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebElement elements = null;
		elements = webWait.until(ExpectedConditions.elementToBeClickable(element));
		elements.click();
	}
	
	public void sendKeysWebElements(WebElement element, String text) {
		clickOnWebElement(element, 5);
//		element.click();
		element.clear();
		element.sendKeys(text);
	}
	
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	public void mouseHoverAndClick(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}
	
	// Create 3 functions of dropdown - 1. By index, By value, By visible text 

}
