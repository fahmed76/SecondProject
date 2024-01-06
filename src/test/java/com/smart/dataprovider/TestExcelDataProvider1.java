package com.smart.dataprovider;

import org.testng.annotations.Test;

public class TestExcelDataProvider1 {
	
	@Test(dataProvider = "loginData", dataProviderClass = ExcelDataSupplier.class)
	public void loginTest(String name, String pass) {
		System.out.println(name + " logged in to the application with " + pass);
	}

}
