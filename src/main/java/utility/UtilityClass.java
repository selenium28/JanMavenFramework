package utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
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

}
