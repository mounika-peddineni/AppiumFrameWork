package com.appium.webapps;

import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class GeneralStore {

	@Test
	public void generalStoreApp() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Shoes");
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		driver.findElementByXPath("//android.widget.TextView[@text='ADD TO CART']").click();
		driver.findElementByXPath("//android.widget.ImageButton[@resource-id='com.androidsample.generalstore:id/appbar_btn_cart']").click();
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		Thread.sleep(2000);
		Set<String> apps = driver.getContextHandles();
		for(String app : apps)
		{
			System.out.println(app);
		}
		Thread.sleep(4000);
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElementByXPath("//input[@name='q']").sendKeys("Appium");
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
		driver.context("NATIVE_APP");
		
}
}
