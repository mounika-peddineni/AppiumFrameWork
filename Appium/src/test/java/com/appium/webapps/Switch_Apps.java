package com.appium.webapps;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Switch_Apps {

	@Test
	public void switchApps() throws Throwable
	{
		
		String calAppPackage = "com.sec.android.app.popupcalculator";
		String calAppActivity = ".Calculator";
		
		String voonikAppPackage = "com.mrvoonik.android";
		String voonikAppActivity = ".splashsection.Splash";
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.mrvoonik.android");
		dc.setCapability("appActivity", ".splashsection.Splash");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Search").click();
		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.mrvoonik.android:id/search']").sendKeys("Shoes");
		Thread.sleep(2000);
		driver.startActivity(calAppPackage, calAppActivity);
		driver.findElementByAccessibilityId("9").click();
		Thread.sleep(1000);
		driver.launchApp();
		
		
	}
}
