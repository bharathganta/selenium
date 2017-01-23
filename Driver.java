package GenrickLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	/*
	 * @Bharath
	 */
	/*provide driver instance it will choose which driver to launch*/
	public static WebDriver driver;
	public static WebDriver getDriver(){
		if(constants.browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		} else if (constants.browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			driver = new ChromeDriver();
		
	}
		return driver;
}
}