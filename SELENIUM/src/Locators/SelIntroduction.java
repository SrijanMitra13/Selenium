package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "/Users/srijanmitra/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}
}
