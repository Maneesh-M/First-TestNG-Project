package com.myFirstTestNGProject;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class JunitTestClass

{

	/*@Test
	public void m1(){
		System.out.println("Im in M1");
	}
	
	@BeforeClass
	public static void m2(){
		System.out.println("Im in Before Test");
	}
	
	@Before
	public void m3(){
		System.out.println("IAm at Before");
	}*/
	
	
	@Test   //import org.junit.Test;
	public void softassertTest(){
	SoftAssert sa=new SoftAssert();
	System.out.println("SoftAssert is started");
	sa.assertEquals(12, 15);
	System.out.println("SoftAssert is Ended");
	//assewrtAll() method is important to fail test cases at last
	sa.assertAll();
	}
	
	@Test    //import org.junit.Test;
	public void hardassertionTest(){
		System.out.println("HardAssert is started ");
		Assert.assertEquals(12, 15);
		//in hard assertion below code wont be executed
	System.out.println("HardAssert is ended");
	}
}
