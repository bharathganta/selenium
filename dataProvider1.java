package com.mavwealth;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenrickLibrary.ExcelLibs;

public class dataProvider1 {

	ExcelLibs elibs=new ExcelLibs();
		
		//This test method declares that its data should be supplied by the Data Provider
		// "getdata" is the function name which is passing the data
	       // Number of columns should match the number of input parameters
		@Test(dataProvider="getData")
		public void setData(String username, String password)
		{
			System.out.println("you have provided username as::"+username);
			System.out.println("you have provided password as::"+password);
		}

		@dataProvider
		public Object[][] getData() throws EncryptedDocumentException, InvalidFormatException, IOException
		{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[3][2];


		for(int i=0;i<3;i++){
		// 1st row
		data[i][0] =elibs.getExcelData("Sheet1", i, 0);
		data[i][1] = elibs.getExcelData("Sheet1", i, 1);


		}
		return data;
		}
	}


