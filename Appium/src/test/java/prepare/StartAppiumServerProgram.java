package prepare;

import java.io.File;

import org.testng.annotations.Test;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StartAppiumServerProgram {

	@Test
	public void startAppium()
	{
	AppiumDriverLocalService service= AppiumDriverLocalService.buildService(
			new AppiumServiceBuilder().usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
			.withAppiumJS(new File("C:\\Program Files(x86)\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js")).withLogFile(new File("D:\\log.txt")));
			service.start();
	}

}
