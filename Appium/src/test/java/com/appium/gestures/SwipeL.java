package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeL {
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
		//driver.swipe(160, 450, 360, 450, 500);
		
		Dimension d = driver.manage().window().getSize();
		int height = d.getHeight();
		System.out.println("Height: "+height);
		int width = d.getWidth();
		System.out.println("Width: "+width);
		
		int x1 = (int)(width*.30);
		int y1 = (int)(height*.30);
		int x2 = (int)(width*.30);
		int y2 = (int)(height*.70);
		
		driver.swipe(x1, y1, x2, y2, 1000);
		
		int X1 = x1;
		int Y1 = y2;
		int X2 = (int)(width*.60);
		int Y2 = y2;
		
		driver.swipe(X1, Y1, X2, Y2, 1000);
}
}
