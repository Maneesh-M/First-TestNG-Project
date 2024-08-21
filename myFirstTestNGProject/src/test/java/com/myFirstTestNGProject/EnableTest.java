package com.myFirstTestNGProject;

import org.testng.annotations.Test;

public class EnableTest {
@Test(enabled=true)
public void enableTest(){
	System.out.println("ENABLED TEST");
}
@Test(enabled=false)
public void disableTest(){
	System.out.println("DISABLED TEST");
}
}
