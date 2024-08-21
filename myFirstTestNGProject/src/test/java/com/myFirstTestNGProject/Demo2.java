package com.myFirstTestNGProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
@Test
public void m1(){
	System.out.println("Iam in Test 1");
}
@BeforeClass
public void bcls(){
	System.out.println("Iam in Before Class");
}
@BeforeMethod
public void bmthd(){
	System.out.println("Iam in Before Method");
}
@BeforeTest
public void btest(){
	System.out.println("Iam in Before Test");
}

@AfterTest
public void atest(){
	System.out.println("Iam in After Test");
}
@AfterMethod
public void amethd(){
	System.out.println("Iam in After Method");
}
@Test
public void m2(){
	System.out.println("Iam in Test 2");
}
@AfterClass
public void aclass(){
	System.out.println("Iam at After Class");
}
}
