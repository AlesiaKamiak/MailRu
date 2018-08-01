package driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "e:\\driver\\chromedriver.exe";

//	private static DriverSingleton instance = null;
	private static WebDriver driver = null;

	
	public static WebDriver getDriver() {
		if (null == driver) {
			System.setProperty(CHROME, CHROME_PATH);
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			System.out.println("Browser started");
		}

		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}


}
