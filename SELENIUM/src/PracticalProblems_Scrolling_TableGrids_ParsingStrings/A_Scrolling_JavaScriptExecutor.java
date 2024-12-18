package PracticalProblems_Scrolling_TableGrids_ParsingStrings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A_Scrolling_JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		//Scrolling down the window
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//Scrolling inside the table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//Summing up the values in the above table
		int sum = 0;
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i =0; i<values.size(); i++) {
			sum = sum+Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		
		//Compare the sum with the one displayed in the page
		int total =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
	
		Thread.sleep(5000);
		driver.quit();
	}

}
