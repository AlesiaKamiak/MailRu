package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
	private static final String CHROME = "webdriver.chrome.driver";
	private static final String CHROME_PATH = "e:\\driver\\chromedriver.exe";
	private static DriverSingleton instance = null;
	private static WebDriver driver = null;

	static {
		instance = new DriverSingleton();
		initWebDriver();
	}

	private DriverSingleton() {

	}

	private static void initWebDriver() {
		System.setProperty(CHROME, CHROME_PATH);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void stopWebDriver() {
		driver.close();
		driver = null;
	}

	public static DriverSingleton getInstance() { // this is better
		return instance;
	}

	public void openPage(String url) {
		driver.get(url);
	}
	
	public WebElement findByName(String elementName) {
		return driver.findElement(By.name(elementName));
	}
	public WebElement findByExpath(String xpathExpression) {
		return driver.findElement(By.xpath(xpathExpression));
	}

}
