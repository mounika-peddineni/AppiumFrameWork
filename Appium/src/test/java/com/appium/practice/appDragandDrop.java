package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.DragAndDrop;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class appDragandDrop {
	@Test
	public void DragandDropdemo() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.mobeta.android.demodslv");
		dc.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@resource-id='com.mobeta.android.demodslv:id/activity_title']").click();
		WebElement src = driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.mobeta.android.demodslv:id/drag_handle']");
		WebElement tar = driver.findElementByXPath("//android.widget.TextView[@text='Herbie Hancock']");
		Thread.sleep(2000);
		TouchAction ta = new TouchAction(driver);
		ta.longPress(src).waitAction(3000).moveTo(tar).release().perform();
		//android.widget.TextView[@text='Larry Grenadier']"
		
	}
}
