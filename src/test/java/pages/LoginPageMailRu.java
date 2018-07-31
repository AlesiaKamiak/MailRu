package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverSingleton;

public class LoginPageMailRu extends AbstractPageMailRu {

	private final String BASE_URL = "https://mail.ru/";

	private WebElement inputLogin;
	private WebElement inputPassword;
	private WebElement buttonSubmit;
	private WebElement writeLetter;

	public LoginPageMailRu(DriverSingleton driver) {
		super(driver);
	}

	@Override
	public void openPage() {
		driver.openPage(BASE_URL);
	}
	
	public void login(String username, String password) {
		inputLogin = driver.findByName("loginForm.login");
		inputLogin.sendKeys((username));
		
		inputPassword = driver.findByName("loginForm.password");
		inputPassword.sendKeys(password);
		
		buttonSubmit = driver.findByName("loginForm.password");
		buttonSubmit.click();
		
		
		
	}
	

}
