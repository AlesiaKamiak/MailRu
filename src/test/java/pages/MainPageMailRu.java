package pages;

import javax.naming.OperationNotSupportedException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.DriverSingleton;

public class MainPageMailRu extends AbstractPageMailRu {
	
	private final String BASE_URL = "https://mail.ru/";
	
	
	@FindBy(css = "#b-toolbar__left > div > div > div.b-toolbar__group.b-toolbar__group_left > div > a > span")
	private WebElement buttonCreateNew;
	
	@FindBy(xpath = "//div[@id='b-letters']/div/div[2]/div/div[2]/div/div/a/div[4]/div[3]/div/div")
	private WebElement buttonSent;

	public MainPageMailRu(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void clickOnNewMailButton()
	{
		buttonCreateNew.click();
	}
	
	public void clickOnSentMailButton()
	{
		buttonSent.click();
	}

	@Override
	public void openPage()
	{
		driver.navigate().to(BASE_URL);
	}

	
}
