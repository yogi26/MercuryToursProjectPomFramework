package com.NewTours.Utilities;



public class TestDataProvider
{
	public static Object[][] getTestdata(String sheetName)
	{
		XlsReader reader=new XlsReader();
		return (reader.getTestData(sheetName));
	}
}
