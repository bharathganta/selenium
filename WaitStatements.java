package GenrickLibs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatements {
	public void pageLoadWait(){
		/*
		 * Implicitly Wait Statement.
		 */
		Driver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void waitForLinkPresent(String linkName){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                          (By.linkText(linkName)));		
	}
	/*
	 * @parameter webElement
	 * 
	 */
	
	public void waitForXpathPresent(String wbXpath){
		WebDriverWait wait = new WebDriverWait(Driver.driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated
				                             (By.xpath(wbXpath)));		
	}

}
