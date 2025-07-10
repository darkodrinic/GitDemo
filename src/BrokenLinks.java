import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert ass = new SoftAssert();
		
		for(int i =1; i<links.size(); i++) {
			String link = links.get(i).getDomAttribute("href");
			if(!link.equals("#")) {
			@SuppressWarnings("deprecation")
			HttpURLConnection conn = (HttpURLConnection) new URL(link).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int responsCode = conn.getResponseCode();
			System.out.println(responsCode);
			ass.assertTrue(responsCode>400, "The link with text " + link + " is broken");
//			if(responsCode>400) {
//				System.out.println("The link with text " + link + " is broken");
//				Assert.assertTrue(false);
			}
			}
		}
		
		
		
		
		
		
		
		// broken URL
		// step 1 - is to get all urls  using selenium
		// Java methods will call URLs and gets you the status code
//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
//		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int responsCode = conn.getResponseCode();
//		System.out.println(responsCode);

	}


