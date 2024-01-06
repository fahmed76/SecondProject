package com.smart.dataprovider;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	
	@DataProvider(name = "getData")
	public String[] getData() {	
	    return new String []{"Ibrahim", "Mustafa", "Saiful", "Rahman", "Sadia", "Imtiaz", "Sharmin", "Farhana"};
	}

	@DataProvider(name = "loginData2")
	public String[][] loginData() {
		
	    return new String [][] {
		{"username1", "password1"},
		{"username2", "password2"},
		{"username3", "password3"}
		};
		
	
	
}
	
}