package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getpassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000); 
		
		String loginConfirmation = driver.findElement(By.tagName("p")).getText();
		System.out.println(loginConfirmation);
		Assert.assertEquals(loginConfirmation, "You are successfully logged in.");
		
		String userConfirmation = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
		Assert.assertEquals(userConfirmation,"Hello " + name + ",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		String logoutConfirmation = driver.findElement(By.xpath("//h1[text()='Sign in']")).getText();
		Assert.assertEquals(logoutConfirmation, "Sign in");
		
		Thread.sleep(5000);
		driver.quit();

	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div/button[@class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText();
		
//		Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
		String password = passwordArray[1].split("'")[0];
		return password;
	}

}
