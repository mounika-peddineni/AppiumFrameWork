package com.appium.webapps;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gereric.appium.FileUtility;

import io.appium.java_client.android.AndroidDriver;

public class ChromeLaunch {
	@Test
	public void browserLaunch() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("browserName", "Chrome");
		dc.setCapability("noreset", "true");
		
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//driver.findElementById("m_login_email").sendKeys("mounika.peddineni@gmail.com");
		//driver.findElementById("m_login_password").sendKeys("Venkatesh@33");
		//driver.findElementByName("login").click();
		//driver.findElement(By.id("m_login_email")).sendKeys("mounika.peddineni@gmail.com");
		//driver.findElement(By.id("m_login_password")).sendKeys("Venkatesh@33");
		//driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mounika.peddineni@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sujatha@33");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
}
}
