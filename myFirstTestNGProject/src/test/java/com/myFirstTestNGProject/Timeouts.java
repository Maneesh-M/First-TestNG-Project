package com.myFirstTestNGProject;

import org.testng.annotations.Test;

public class Timeouts {
@Test(timeOut=5000)
public void testTimeOut(){
	System.out.println("Iam in Test Timeout");
}
}
