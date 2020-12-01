package com.appium.gestures;

import java.awt.Dimension;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Scroll {
	
	AndroidDriver driver;
	@Test
	public void ScrollAPIDemo() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("Views").click();
		
		//scrolling("text", "Layouts");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + "text" + "(\"" + "Layouts" + "\"))");
		//driver.findElementByXPath("//android.widget.TextView[@content-desc='Layouts']").click();
		
		driver.swipe(325, 1210, 325, 318, 1000);
		driver.findElementByXPath("//android.widget.TextView[@content-desc='Layouts']").click();


}
	
	
	public void scrolling(String an , String av) 
	 {
	  //driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	 }
}
