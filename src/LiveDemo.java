import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.linkText("Top Deals")).click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		// get original list//tr/td[1]
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> firstListVeg = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> listBefore = firstListVeg.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String>sortedList = listBefore.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(listBefore.equals(sortedList));
		List<String> price;
		// scan the name column with get text -> Rice print the price of the rice
		do {
			List<WebElement> row = driver.findElements(By.xpath("//tr/td[1]"));
		price = row.stream().filter(s->s.getText().contains("Rice"))
		.map(s->getPriceVeggie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1) {
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
		

	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
