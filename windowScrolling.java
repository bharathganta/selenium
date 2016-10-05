package com.mavwealth;

import org.openqa.selenium.JavascriptExecutor;


import GenrickLibrary.Driver;

public class windowScrolling {
	
	
		public static void main(String args[]){

		
		
	// Scroll Down 
	JavascriptExecutor jse = (JavascriptExecutor)Driver.driver;
	jse.executeScript("scroll(0, 250);");
	
	// Scroll Top
	jse.executeScript("scroll(0, -250);");
	
	//Scroll Left 
	jse.executeScript("window.scrollBy(-200,0)", "");
	
	//Scroll Right
	jse.executeScript("window.scrollBy(200,0)", "");

		
}
}
