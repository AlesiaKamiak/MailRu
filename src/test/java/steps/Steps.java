package steps;

import org.openqa.selenium.WebDriver;

import driver.DriverSingleton;
import pages.LoginPageMailRu;
import pages.MainPageMailRu;
import pages.NewMailPage;

public class Steps {
	
	private WebDriver driver;
	


	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		DriverSingleton.closeDriver();
	}

	public void loginMailru(String username, String password)
	{
		LoginPageMailRu loginPage = new LoginPageMailRu(driver);//???
		loginPage.openPage();
		loginPage.login(username, password);
	}

	public boolean createNewMail(String toWhom, String subject, String message)
	{
		MainPageMailRu mainPage = new MainPageMailRu(driver);
		mainPage.clickOnNewMailButton();
		NewMailPage createNewMailPage = new NewMailPage(driver);
	
		String expectedSubject = createNewMailPage.createNewMail(toWhom, subject, message);
		return true;
	}

}
