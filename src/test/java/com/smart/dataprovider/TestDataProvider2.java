package com.smart.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider2 {
	
//	@DataProvider(name = "getData")
//	public String[][] getData() {
		
//		String[][] testData = new String[3][2];
//		testData[0][0] = "username1";
//		testData[0][1] = "password1";
		
//		testData[1][0] = "username2";
//		testData[1][1] = "password2";
		
//		testData[2][0] = "username3";
//		testData[2][1] = "password3";
		
		//Another way to do the [][] array
		
//		String[][] testData = new String [][] {
//			{"username1", "password1"},
//			{"username2", "password2"},
//			{"username3", "password3"}
//		};
		
		// Another way to do the [][] array
		
//	    return new String [][] {
//		{"username1", "password1"},
//		{"username2", "password2"},
//		{"username3", "password3"}
//		};
		

//	}
	@Test (dataProvider = "loginData2", dataProviderClass = DataSupplier.class)
	public void loginTest(String username, String password) {
		System.out.println(username + " logged in to the application with " + password);
	}

}
