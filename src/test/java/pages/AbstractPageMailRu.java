package pages;

import org.openqa.selenium.WebDriver;

import driver.DriverSingleton;

public abstract class AbstractPageMailRu  {

	protected static WebDriver driver;
	
	public abstract void openPage();

	public AbstractPageMailRu(WebDriver driver) {
		this.driver = driver;
	}
	
	
	

}
