package pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.WebElement;

import driver.DriverSingleton;

public class MainPageMailRu extends AbstractPageMailRu {
	
	private final String BASE_URL = "https://mail.ru/";
	
	private WebElement enterButton;
	
	public void enter(){
		enterButton = driver.findByExpath("//*[@id=\"PH_authLink\"]");
	}

	@Override
	public void openPage() {
		driver.openPage(BASE_URL);
	}
	
	public MainPageMailRu(DriverSingleton driver) {
		super(driver);
	}

	
}
