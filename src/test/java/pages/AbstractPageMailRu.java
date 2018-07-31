package pages;

import org.openqa.selenium.WebDriver;

import driver.DriverSingleton;

public abstract class AbstractPageMailRu  {

	protected static DriverSingleton driver;
	
	public abstract void openPage();

	public AbstractPageMailRu(DriverSingleton driver) {
		this.driver =(DriverSingleton) driver;
	}
	
	
	

}
