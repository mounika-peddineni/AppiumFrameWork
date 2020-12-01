package com.appium.drivermtd;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class RemoveApp {
	@Test
	public void removeAppandCheck() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		//dc.setCapability("appPackage", "com.mobeta.android.demodslv");
		//dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.removeApp("com.mobeta.android.demodslv");
		Thread.sleep(2000);
		System.out.println("The status of app is: "+driver.isAppInstalled("com.mobeta.android.demodslv"));
}
}
