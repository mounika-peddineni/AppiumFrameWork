package com.appium.practice;

import org.testng.annotations.Test;

import com.gereric.appium.FileUtility;

public class Practice {

	@Test
	public void getData() throws Throwable
	{
		FileUtility flib = new FileUtility();
		String dName = flib.getPropertyKeyValue("UDID");
		System.out.println(dName);
	}
}
