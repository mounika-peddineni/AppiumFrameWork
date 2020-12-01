package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gereric.appium.GenericUtility;

import io.appium.java_client.android.AndroidDriver;

public class GenericTest {
	@Test
	public void swipeX() throws Throwable
	{
		GenericUtility glib = new GenericUtility(driver);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
					driver.swipeAction(.20, .20, .60, .80);
					Thread.sleep(1000);
					glib.swipeAction(.60, .20, .20, .80);
				
	}

}
