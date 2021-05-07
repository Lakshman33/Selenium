package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
	
	public static void main(String[] args) {
		
		// To configure the browser
		
	//system.setProperty("webdriver chrome.driver", "c:\\chromedriver.exe");
		
		
		// To launch the browser
		
		WebDriver driver = new ChromeDriver ();
		driver.manage().window().maximize();

		

		
	}
	

}
