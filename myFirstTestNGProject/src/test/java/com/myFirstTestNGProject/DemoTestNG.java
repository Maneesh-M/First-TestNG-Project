package com.myFirstTestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestNG {

	/*public static void main(String args[]){
		
		System.out.println("Im in main method");
	}*/
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("A");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("B");
	}
	
	@Test
	public void m2(){
		System.out.println("Iam in First Method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("C");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("D");
	}
	
	@Test
	public void m3(){
		System.out.println("Im in- m3");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Bfr Class");
	}
	
	@AfterClass
	public void aftreClass(){
		System.out.println("Aftr Class");
	}
}

