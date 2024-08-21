package com.myFirstTestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAction {

	protected static WebDriver driver;
	/*@Test
	public void perform(){
		WebElement linkForUploaders=driver.findElement(By.linkText("For Uploaders"));
	}*/

	@BeforeMethod
	public void browser(){
		System.setProperty("webdriver.chrome.driver", "chromedriver_v80.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public static void actions() throws InterruptedException {
		WebElement txtGoogleSearch =driver.findElement(By.xpath("//*[@name='q']"));

		Actions act=new Actions(driver); 	//Creating a object for Actions class
		Thread.sleep(3000);
		act.moveToElement(txtGoogleSearch).click();
		act.keyDown(txtGoogleSearch,Keys.SHIFT).build().perform();
		act.sendKeys(txtGoogleSearch,"Testing Framework").build().perform();
		act.keyUp(txtGoogleSearch,Keys.SHIFT).build().perform();
		act.contextClick(txtGoogleSearch).build().perform();
		
		
		

	}
}
