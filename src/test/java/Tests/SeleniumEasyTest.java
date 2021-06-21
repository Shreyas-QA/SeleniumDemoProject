package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.InputForms;
import Utility.config;


public class SeleniumEasyTest {

	config configobj;

	HomePage hpage;
	InputForms inputobj;
	WebDriver driver;

	@BeforeTest
	public void setup() {
		configobj = new config();
		configobj.readConfigSetting();
		System.setProperty("webdriver.chrome.driver", configobj.GetChromePath());
		driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(configobj.Geturl());

	}

	@Test(priority = 1)
	public void HomeScreenTestCases() {

		hpage = new HomePage(driver);
		hpage.EnterHomeScreen();

	}

	@Test(priority = 2)
	public void InputForm() {

		inputobj = new InputForms(driver);
		inputobj.ClickOnInputForm();
		inputobj.ClickOnSubmitForm();

	}

}
