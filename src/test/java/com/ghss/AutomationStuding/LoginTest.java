package com.ghss.AutomationStuding;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginTest extends Base {

	@Test
	
	public void verifyBothCorrect() {
		String usernameValue= "admin";
		WebElement verifyUsername= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername.sendKeys(usernameValue);
		String Username= verifyUsername.getText();
		
		String passwordValue= "admin";
		WebElement verifyPassword= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword.sendKeys(passwordValue);
		String password= verifyPassword.getText();
		
		WebElement signInButton= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton.click();
		
		String expectedUrl="https://groceryapp.uniqassosiates.com/admin";
		String actualUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl,"Invalid datas"+expectedUrl);
		
		}
	@Test
	public void verifyUsernameCorrect() {
		String usernameValue1= "admin";
		WebElement verifyUsername1= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername1.sendKeys(usernameValue1);
		String Username1= verifyUsername1.getText();
		
		String passwordValue1= "adminology";
		WebElement verifyPassword1= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword1.sendKeys(passwordValue1);
		String password1= verifyPassword1.getText();
		
		WebElement signInButton1= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton1.click();
		
		WebElement errorMessage= driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean invalidErrorMessage = errorMessage.isDisplayed();
		String alertValue=driver.switchTo().alert().getText();
		assertTrue(invalidErrorMessage, "Alert message not present");
		
		String expectedUrl="https://groceryapp.uniqassosiates.com/admin/login";
		String actualUrl= driver.getCurrentUrl();
		assertEquals(expectedUrl,actualUrl,"Invalid datas"+expectedUrl);
		
		}
	
	@Test
	public void verifyPasswordCorrect() {
		String usernameValue2= "dance";
		WebElement verifyUsername2= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername2.sendKeys(usernameValue2);
		String Username2= verifyUsername2.getText();
		
		String passwordValue2= "admin";
		WebElement verifyPassword2= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword2.sendKeys(passwordValue2);
		String password2= verifyPassword2.getText();
		
		WebElement signInButton2= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton2.click();
		
		}
	
	@Test
	public void verifyBothIncorrect() {
		String usernameValue3= "abc";
		WebElement verifyUsername3= driver.findElement(By.xpath("//input[@type='text']"));
		verifyUsername3.sendKeys(usernameValue3);
		String Username3= verifyUsername3.getText();
		
		String passwordValue3= "adminology";
		WebElement verifyPassword3= driver.findElement(By.xpath("//input[@type='password']"));
		verifyPassword3.sendKeys(passwordValue3);
		String password3= verifyPassword3.getText();
		
		WebElement signInButton3= driver.findElement(By.xpath("//button[@type='submit']"));
		signInButton3.click();
		
		}
}
