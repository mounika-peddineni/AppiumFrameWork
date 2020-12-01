package com.appium.drivermtd;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class KeyCode {

	@Test
	public void keyCode() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.sec.android.app.camera");
		dc.setCapability("appActivity", ".Camera");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.Button[@resource-id='com.sec.android.app.camera:id/button1']").click();
		//driver.longPressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		Thread.sleep(2000);
		//driver.findElementByXPath("//GLButton[@text='Switch to front camera']").click();
		//driver.longPressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		driver.longPressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		Thread.sleep(2000);
		driver.longPressKeyCode(AndroidKeyCode.KEYCODE_MUTE);
		Thread.sleep(2000);
	}
}
