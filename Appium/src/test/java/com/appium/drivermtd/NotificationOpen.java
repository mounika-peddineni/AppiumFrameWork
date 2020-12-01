package com.appium.drivermtd;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class NotificationOpen {
	@Test
	public void openNotification() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.bhanu.notificationreminders");
		dc.setCapability("appActivity", ".MainDrawerActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.bhanu.notificationreminders:id/txtNewNoteTitle']").sendKeys("rem");
		driver.findElementByXPath("//android.widget.Button[@text='NOTIFY']").click();
		driver.openNotifications();
		//driver.findElementByAccessibilityId("Read").click();
		driver.findElementByXPath("//android.widget.TextView[@resource-id='android:id/title']").click();
		driver.findElementByXPath("//android.widget.TextView[@resource-id='com.bhanu.notificationreminders:id/invite_friends_close']").click();
}
}
