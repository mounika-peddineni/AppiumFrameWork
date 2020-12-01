package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MultiTouch3lines {
	@Test
	public void swipeLShape() throws Throwable
	{
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
		
		int x = (int)driver.manage().window().getSize().getWidth()/2;
		int y = (int)driver.manage().window().getSize().getHeight()/2;
		
		TouchAction finger1 = new TouchAction(driver);
		finger1.press(x-30,y-50).moveTo(x-30, y+100);
		
		TouchAction finger2 = new TouchAction(driver);
		finger2.press(x,y-50).moveTo(x, y+100);
		
		TouchAction finger3 = new TouchAction(driver);
		finger3.press(x+30,y-50).moveTo(x+30, y+50);
		
		MultiTouchAction mta = new MultiTouchAction(driver);
		mta.add(finger1).add(finger2).add(finger3).perform();
		
}
}
