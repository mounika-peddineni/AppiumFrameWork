package voonik.Programs;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Search {
	@Test
	public void clickOnRefundPolicy() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "com.mrvoonik.android");
		dc.setCapability("appActivity", ".splashsection.Splash");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element = driver.findElementByAccessibilityId("Search");
		TouchAction ta = new TouchAction(driver);
		ta.longPress(element,500).release().perform();
		driver.findElementByXPath("//android.widget.EditText[@resource-id='com.mrvoonik.android:id/search']").sendKeys("Shoes");
		
		
		
}
}

