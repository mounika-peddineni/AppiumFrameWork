package com.appium.gestures;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DropDownAPIDemo {
	@Test
	public void handleDropDown() throws Throwable
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
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@content-desc='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc='Controls']").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc='2. Dark Theme']").click();
		driver.hideKeyboard();
		driver.findElementByXPath("//android.widget.TextView[@text='Mercury']").click();
		List<WebElement> options = driver.findElementsByClassName("android.widget.CheckedTextView");
		System.out.println("Total Options: "+options.size());
		String expRes = "Jupiter";
		for(WebElement e: options)
		{
			String element = e.getText();
			if(expRes.equals(element))
			{
				e.click();
				break;
			}
		}
		
		
		

}
}
