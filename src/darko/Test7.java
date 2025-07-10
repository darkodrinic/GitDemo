package darko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		String checkboxLabel = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/..")).getText();
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText(checkboxLabel);
		driver.findElement(By.id("name")).sendKeys(checkboxLabel);
		driver.findElement(By.id("alertbtn")).click();
		String message = driver.switchTo().alert().getText();
		Assert.assertEquals(message, "Hello " + checkboxLabel + ", share this practice page and share your knowledge");

	}

}
