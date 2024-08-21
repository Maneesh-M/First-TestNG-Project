package com.myFirstTestNGProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gmail {
	static WebDriver dr;
	static String username;
	static String password;

	@BeforeMethod
	public void browser(){
		System.setProperty("webdriver.chrome.driver","chromedriver_v80.exe");
		dr=new ChromeDriver();
		dr.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	}

	@Test(dataProvider="getDetails")
	public void Login(String username, String password){
		dr.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(username);
		dr.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(password);
		dr.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
	}
	@DataProvider
	public Object[][] getDetails(){
		Object[][] details=new Object[1][2];
		details[0][0]="maneesherat@gmail.com";
		details[0][1]="maneesh145";

		return details;

	}
}
