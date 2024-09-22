package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//.ui-state-default.ui-state-highlight
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		Thread.sleep(3000);
		driver.quit();
	}

}
