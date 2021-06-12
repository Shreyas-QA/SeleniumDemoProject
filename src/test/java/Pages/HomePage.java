package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	By CloseButton = By.id("at-cv-lightbox-close");
	By DemoHomeButton = By.linkText("Demo Home");
	By Sliderbtn = By.xpath("//a[@class='right carousel-control']");

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}

	// Set user name in textbox

	public void EnterHomeScreen() {

		driver.findElement(CloseButton).click();
		driver.findElement(DemoHomeButton).click();
	}

	public void clickonSlider() {

		driver.findElement(Sliderbtn).click();
	}
}
