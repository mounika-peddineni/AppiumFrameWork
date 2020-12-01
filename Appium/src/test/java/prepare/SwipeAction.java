package prepare;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class SwipeAction {
	@Test
	public void swipeXShape() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("deviceName", "Galaxy On6");
		dc.setCapability("automationName", "Appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10");
		dc.setCapability("UDID", "32000603b4ed4531");
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");
		
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Dimension d = driver.manage().window().getSize();
		int width = d.getWidth();
		int height = d.getHeight();
		
		int x1 = (int) (width*.20);
		int y1 = (int) (height*.20);
		int x2 = (int) (width*.20);
		int y2 = (int) (height*.60);
		
		driver.swipe(x1, x2, x2, y2, 1000);
		
		int X1 = x1;
		int Y1 = y2;
		int X2 = (int) (width*.60);
		int Y2 = y2;
		
		driver.swipe(X1, Y1, X2, Y2, 1000);
		
		
		
		
		
		
		
}
}
