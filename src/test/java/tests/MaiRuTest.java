package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.DriverSingleton;
import pages.LoginPageMailRu;

import steps.Steps;

public class MaiRuTest {

	private Steps steps;

	private String username = "tathtp";
	private String password = "Klopik123";

	@BeforeTest
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	@Test
	public void oneCanCreateProject() {
		steps.loginMailru(username, password);
		Assert.assertTrue(steps.createNewMail("tathtp@mail.ru", "test", "Hi"));

	}

	@AfterTest
	public void stopBrowser() {
		steps.closeDriver();
	}

}
