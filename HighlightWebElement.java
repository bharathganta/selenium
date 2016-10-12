package com.mavwealth;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import GenrickLibrary.Driver;

public class HighlightWebElement {
	
	public void highlightWebelement(WebElement element){
		
			JavascriptExecutor js=(JavascriptExecutor)Driver.driver; 
			 
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			 
			try 
			{
			Thread.sleep(500);
			} 
			catch (InterruptedException e) {
			 
			System.out.println(e.getMessage());
			} 
			 
			js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", element); 
			 
			}
	}


