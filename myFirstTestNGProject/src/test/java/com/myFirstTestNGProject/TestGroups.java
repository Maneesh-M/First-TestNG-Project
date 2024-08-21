package com.myFirstTestNGProject;

import org.testng.annotations.Test;

public class TestGroups {
@Test(groups={"Test"})
public void m1(){

	System.out.println("A");
}
@Test(groups={"Test"})
public void m2(){

	System.out.println("B");
}
@Test(groups={"Test"})
public void m3(){

	System.out.println("C");
}
}
