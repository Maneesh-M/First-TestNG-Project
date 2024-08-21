package com.myFirstTestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoWebShop {
	static WebDriver dr;
	
	@BeforeMethod
	public void browser(){
		System.setProperty("webdriver.chrome.driver","chromedriver_v80.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/login");
	}

	@Test(dataProvider="getDetails")
	public void Login(String user, String pass){
		dr.findElement(By.xpath("//*[@id='Email']")).sendKeys(user);
		dr.findElement(By.xpath("//*[@id='Password']")).sendKeys(pass);
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}
	@DataProvider
	public Object[][] getDetails(){
		Object[][] details=new Object[1][2];
		details[0][0]="maneesherat@gmail.com";
		details[0][1]="maneesh12345";

		return details;

	}
}
