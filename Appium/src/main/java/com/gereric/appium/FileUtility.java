package com.gereric.appium;

import java.io.FileInputStream;
import java.util.Properties;

public class FileUtility {

	public String getPropertyKeyValue(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./testdata/commonData.Properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
		
	}
}
