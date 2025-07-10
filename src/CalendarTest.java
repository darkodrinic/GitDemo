import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "6";
		String date = "15";
		String year = "2027"; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.linkText("Top Deals")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText.react-calendar__navigation__label__labelText--from")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText.react-calendar__navigation__label__labelText--from")).click();
		WebElement calendarContainer = driver.findElement(By.cssSelector(".react-calendar__viewContainer"));
		calendarContainer.findElement(By.xpath("//button[contains(text(),'" + year + "')]")).click();
		calendarContainer.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		calendarContainer.findElement(By.xpath("//abbr[contains(text(),'" + date + "')]")).click();
		String actualMonth = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__month")).getDomAttribute("value");
		String actualDate = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__day")).getDomAttribute("value");
		String actualYear = driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).getDomAttribute("value");
		Assert.assertEquals(actualMonth, month);
		Assert.assertEquals(actualDate, date);
		Assert.assertEquals(actualYear, year);
		

	}

}
