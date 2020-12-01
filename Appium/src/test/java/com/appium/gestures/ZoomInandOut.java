package com.appium.gestures;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gereric.appium.FileUtility;
import com.google.common.io.Files;

import io.appium.java_client.android.AndroidDriver;

public class ZoomInandOut {
	@Test
	public void ScaleAPP() throws Throwable
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
		//driver.zoom(element);
		Thread.sleep(2000);
		//driver.pinch(element);
		
		int x = (int)(driver.manage().window().getSize().getWidth()*0.75);
		int y = (int)(driver.manage().window().getSize().getHeight()*0.40);
		driver.zoom(x, y);
		Thread.sleep(2000);
		TakesScreenshot t = (TakesScreenshot) driver;
	       File src = t.getScreenshotAs(OutputType.FILE);
	       File dest = new File("./screenshot.png");
	       Files.copy(src, dest);
		
		
		
		

		
}
}
