package PracticalProblems_Scrolling_TableGrids_ParsingStrings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		String country = "India";
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
//		
//		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		for(WebElement option: options) {
			if(option.getText().equalsIgnoreCase(country)) {
				option.click();
				break;
			}
		}
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
