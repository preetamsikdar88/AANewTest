package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add_Tasks extends BaseClass {
	public static WebElement element = null;

	public Add_Tasks(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_addNewTasks() {
		element = driver.findElement(By.xpath("//input[@value='Add New Tasks']"));
		return element;
	}

	public static WebElement dd_customer() {
		element = driver.findElement(By.name("customerID"));
		return element;
	}

	public static WebElement txt_customerName(){
		element=driver.findElement(By.name("customerName"));
		return element;
	}
	public static WebElement dd_project() {
		element = driver.findElement(By.name("projectId"));
		return element;
	}
	
	public static WebElement txt_projectName(){
		element=driver.findElement(By.name("projectName"));
		return element;
	}

	public static WebElement txt_TaskName_1() {
		element = driver.findElement(By.className("task[0].name"));
		return element;
	}

	public static WebElement click_taskDesc_1() {
		element = driver.findElement(By.id("task0.image"));
		return element;
	}

	public static WebElement dd_billingType_1() {
		element = driver.findElement(By.name("task[0].billingType"));
		return element;
	}

	public static WebElement btn_CreateTasks() {
		element = driver.findElement(By.xpath("//input[@value='Create Tasks']"));
		return element;
	}
}
