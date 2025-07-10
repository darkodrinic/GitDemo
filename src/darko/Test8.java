package darko;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int columns = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size();
		System.out.println("Number of columns are " + columns);
		
		int rows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th")).size();
		System.out.println("Number of rows are " + rows);
		
		List<WebElement> list = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		

	}

}
