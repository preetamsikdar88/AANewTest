package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page extends BaseClass {

	public static WebElement element = null;

	public Login_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_username() {
		element = driver.findElement(By.name("username"));
		return element;
	}

	public static WebElement txt_password() {
		element = driver.findElement(By.name("password"));
		return element;
	}

	public static WebElement btn_Login() {
		element = driver.findElement(By.xpath("//input[@type='submit']"));
		return element;
	}
}
