package com.ghss.AutomationStuding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Base {
	public WebDriver driver; //1st declare this step
	
//start a method
	@BeforeMethod
	public void initialBrowser() {
		driver=new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize()	;	
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	
	

}
