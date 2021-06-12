package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputForms {

	WebDriver driver;
	By GetDropDown = By.xpath("//ul[@class='nav navbar-nav']//li[@class='dropdown']/a");
	By SubmitForm = By.xpath(
			"//ul[@class='nav navbar-nav']/li[@class='dropdown open']/ul[@class='dropdown-menu']/li/a[contains(text(),'Simple Form Demo')]");

	public InputForms(WebDriver driver) {

		this.driver = driver;

	}

	public void ClickOnInputForm() {

		List<WebElement> GetAllDropDown = driver.findElements(GetDropDown);
		for (WebElement link : GetAllDropDown) {

			String getText = link.getText();

			if (getText.contains("I")) {

				link.click();

			}
		}
	}

	public void ClickOnSubmitForm() {

		driver.findElement(SubmitForm).click();

	}

}
