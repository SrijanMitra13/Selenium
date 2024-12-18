package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_UiDropdownsEditBoxesErrorValidations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(2000);
		
		//Entering name
		driver.findElement(By.xpath("//div[@class='form-group']/child::input[@name='name']")).sendKeys("SM");
		Thread.sleep(2000);
		
		//Entering email
		driver.findElement(By.xpath("//div[@class='form-group']/child::input[@name='email']")).sendKeys("SM@sm.com");
		Thread.sleep(1000);
		
		//Entering password
//		driver.findElement(By.xpath("//div[@class='form-group']/child::input[@placeholder='Password']")).sendKeys("SM");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("SM");
		Thread.sleep(1000);
		
		//Checking the checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(1000);
		
		//Selecting Female from the dropdown
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(genderDropdown);
		dropdown.selectByVisibleText("Female");
		Thread.sleep(1000);
		
		//Selecting the student radio button
		driver.findElement(By.id("inlineRadio1")).click();
		Thread.sleep(1000);
		
		//Entering the date
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("01/11/1971");
		Thread.sleep(1000);
		
		//Clicking Submit
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		Thread.sleep(1000);
		
		//Verifying the success message
		String message = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(message);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
