import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		
		//Invoking Browser
		//Chrome - ChromeDriver ->Methods
		//WebDriver methods + class methods
		
		//    chromedriver.exe-> Chrome browser
		//step to invoke chrome driver
		//Selenium Manager
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\darko\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		

	}

}
