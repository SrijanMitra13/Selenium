package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com");
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
		
		driver.findElement(By.xpath("//div/button[@class='reset-pwd-btn']")).click();
		
		String tempPassword = driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText();
		System.out.println(tempPassword);
		
		driver.findElement(By.xpath("//div/button[@class='go-to-login-btn']")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

//		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
