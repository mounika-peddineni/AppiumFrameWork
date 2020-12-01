package com.gereric.appium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.appium.gestures.Tap;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class GenericUtility {
	
	AndroidDriver driver;
	
	/* to tap element*/
	public void tapElement(WebElement element)
	{
		driver.tap(1, element, 500);
	}
	
	/* longpress element */
	public void longPress(WebElement src, WebElement dest)
	{
		TouchAction ta = new TouchAction(driver);
		ta.longPress(src).waitAction(3000).moveTo(dest).release().perform();
	}
	
	public void swipeAction(WebDriver driver, double x1, double y1, double x2, double y2)
	{
		Dimension d = driver.manage().window().getSize();
		int height = d.getHeight();
		int width = d.getWidth();
		
		int w1 = (int)(width*x1);
		int h1 = (int)(height*y1);
		int w2 = (int)(width*x2);
		int h2 = (int)(height*y2);
		driver.swipe(w1, h1, w2, h2, 1000);
	}
	
	public void scrollAction(String an, String av)
	{
		driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(" + an + "(\"" + av + "\"))");
	}
	
}
