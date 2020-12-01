package com.appium.gestures;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gereric.appium.FileUtility;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Multi_Touch {
	@Test
	public void useMultitouch() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		FileUtility flib = new FileUtility();
		dc.setCapability("deviceName", flib.getPropertyKeyValue("deviceName"));
		dc.setCapability("automationName", flib.getPropertyKeyValue("automationName"));
		dc.setCapability("platformName", flib.getPropertyKeyValue("platformName"));
		dc.setCapability("platformVersion", flib.getPropertyKeyValue("platformVersion"));
		dc.setCapability("UDID", flib.getPropertyKeyValue("UDID"));
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity", ".MainActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Basic features']").click();
		WebElement element = driver.findElementById("com.davemorrissey.labs.subscaleview.sample:id/imageView");
		int x = (int)driver.manage().window().getSize().getWidth()/2;
		int y = (int)driver.manage().window().getSize().getHeight()/2;
		
		//to zoom in
		TouchAction finger1 = new TouchAction(driver);
		finger1.press(x,y-20).moveTo(x, y-100);
		
		TouchAction finger2 = new TouchAction(driver);
		finger2.press(x,y+20).moveTo(x, y+100);
		
		MultiTouchAction mta = new MultiTouchAction(driver);
		mta.add(finger1).add(finger2).perform();
		
		Thread.sleep(2000);
		
		//to zoom out
		TouchAction finger3 = new TouchAction(driver);
		finger3.press(x,y-100).moveTo(x, y-20);
		
		TouchAction finger4 = new TouchAction(driver);
		finger4.press(x,y+100).moveTo(x, y+20);
		
		MultiTouchAction mta2 = new MultiTouchAction(driver);
		mta2.add(finger3).add(finger4).perform();
		
		
}
}