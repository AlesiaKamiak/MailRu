package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class LoginPageMailRu extends AbstractPageMailRu {

	private final String BASE_URL = "https://mail.ru/";
	
	@FindBy(id = "mailbox:login")
	private WebElement inputLogin;

	@FindBy(id = "mailbox:password")
	private WebElement inputPassword;

	@FindBy(id = "mailbox:submit")
	private WebElement buttonSubmit;

	@FindBy(id = "PH_user-email")
	private WebElement linkLoggedInUser;

	public LoginPageMailRu(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);

	}

	public void login(String username, String password) {
		inputLogin.sendKeys(username);
		inputPassword.sendKeys(password);
		buttonSubmit.click();
		System.out.println("Loged in");
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
		System.out.println("Login page opened");

	}

}
