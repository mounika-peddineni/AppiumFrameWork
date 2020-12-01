package com.appium.practice;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class OpenFB {
	@Test
	public void OpenFacebook() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.facebook.katana");
		dc.setCapability("appActivity", "com.facebook.account.switcher.shortcuts.AccountSwitcherShortcutActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		
	}
}
