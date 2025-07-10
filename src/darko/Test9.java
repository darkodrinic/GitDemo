package darko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		Actions a = new Actions(driver);
		WebElement autoComplete = driver.findElement(By.cssSelector(".ui-autocomplete"));
		a.moveToElement(autoComplete.findElement(By.xpath("//div[text()='India']"))).click().build().perform();
		String actualState = driver.findElement(By.id("autocomplete")).getText();
		System.out.println(actualState);
		

	}

}
