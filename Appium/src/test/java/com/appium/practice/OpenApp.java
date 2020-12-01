package com.appium.practice;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class OpenApp {
	AndroidDriver driver;
	@Test
	public void OpenAPIDemo() throws Throwable
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element1 = driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']");
		tapElement(element1);
		WebElement element2 = driver.findElementByXPath("//android.widget.TextView[@content-desc='Controls']");
		tapElement(element2);
		WebElement element3 = driver.findElementByXPath("//android.widget.TextView[@content-desc='2. Dark Theme']");
		tapElement(element3);
		
		WebElement checkbox = driver.findElementByXPath("//android.widget.CheckBox[@content-desc='Checkbox 1']");
		
		if(!checkbox.isSelected())
		{
			checkbox.click();		
		}
		else
		{
			System.out.println("Radio Button is already selected");
			
		}
		WebElement radioButton = driver.findElementByXPath("//android.widget.RadioButton[@content-desc='RadioButton 1']");
		
		Thread.sleep(1000);
		if(!checkbox.isSelected())
		{
			radioButton.click();
		}
		else
		{
			System.out.println("Radio Button is already selected");
			
		}
		
	}
	
	public void tapElement(WebElement element)
	{
		
		driver.tap(1, element, 500);
	}
	
	

	
}
