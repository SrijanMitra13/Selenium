package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignement1_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		int checkBoxCount = driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		System.out.println(checkBoxCount);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
