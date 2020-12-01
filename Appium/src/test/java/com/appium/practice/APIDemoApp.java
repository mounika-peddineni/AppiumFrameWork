package com.appium.practice;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gereric.appium.FileUtility;

public class APIDemoApp {

	@Test
	public void appAPIActions(String deviceName) throws Throwable
	{
		FileUtility flib = new FileUtility();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", flib.getPropertyKeyValue(deviceName));
		dc.setCapability("automationName", flib.getPropertyKeyValue(automationName));
		dc.setCapability("platformName", flib.getPropertyKeyValue(platformName));
		dc.setCapability("deviceName", flib.getPropertyKeyValue(deviceName));
		dc.setCapability("deviceName", flib.getPropertyKeyValue(deviceName));
		dc.setCapability("deviceName", flib.getPropertyKeyValue(deviceName));
		dc.setCapability("deviceName", flib.getPropertyKeyValue(deviceName));
		
	}
}
