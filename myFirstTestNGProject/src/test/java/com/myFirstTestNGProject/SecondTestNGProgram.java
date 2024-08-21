package com.myFirstTestNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTestNGProgram {

	static WebDriver dr;

	@Test
	public void m2(){
		System.setProperty("webdriver.chrome.driver","chromedriver_v80.exe");
		dr=new ChromeDriver();
		dr.get("http://demowebshop.tricentis.com/login");
	}

}
