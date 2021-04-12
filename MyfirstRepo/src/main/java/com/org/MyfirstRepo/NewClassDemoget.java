package com.org.MyfirstRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewClassDemoget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi IT health");
		
		// declaration and instantiation the objects and variables
		// For Window
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver_win32\\chromedriver.exe"); 

		// Create an instance of ChromeDriver to execute our tests
		WebDriver driver = new ChromeDriver();	
		String baseUrl = "http://demo.guru99.com/test/newtours";
		String execptedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		//launch chrome
		driver.get(baseUrl);
		
		//get actual
		actualTitle = driver.getTitle();
		
		
		//compare
		if (actualTitle.contentEquals(execptedTitle)) {
			System.out.println("Test passed");
			System.out.println(actualTitle);
		} else {
			System.out.println("Test failed");
			System.out.println(actualTitle);
		}
		
		// close browser
		driver.quit();		
	}
}
