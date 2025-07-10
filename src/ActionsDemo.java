import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.bhtelecom.ba/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("mega-menu-item-6556"));
		
		driver.findElement(By.cssSelector(".toggle-search.fa-search.fa")).click();
		a.moveToElement(driver.findElement(By.cssSelector("input[type='search'"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		// move to specific element
		a.moveToElement(move).contextClick().build().perform();
		

	}

}
