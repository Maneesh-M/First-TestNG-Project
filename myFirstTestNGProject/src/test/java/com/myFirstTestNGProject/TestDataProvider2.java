package com.myFirstTestNGProject;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider2 {
	@Test(dataProvider="getData")
	public void method(String user, String pass){
		System.out.println("Iam in Login Tab");
		System.out.println("User Name: " +user);
		System.out.println("Password: " +pass);
	}

	@DataProvider
	public Object[][] getData(){
		Object[][] data= new Object[2][2];
		
		data[0][0]="user1";
		data[0][1]="password1";
		
		data[1][0]="user2";
		data[1][1]="password2";
		return data;
		
	}
}
