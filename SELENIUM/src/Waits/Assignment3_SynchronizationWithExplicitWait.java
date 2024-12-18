package Waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_SynchronizationWithExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String username = "rahulshettyacademy";
		String password = "learning";
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		
		login(driver, username, password);
		checkOutProcess(driver);
		
		Thread.sleep(5000);
		driver.quit();

	}
	
	public static void checkOutProcess(WebDriver driver) {
		Wait<WebDriver> w = new WebDriverWait(driver, Duration.ofSeconds(7));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card-footer']//button[@class='btn btn-info']"));
		for(int i=0; i<products.size(); i++) {
			products.get(i).click();
		}
		
		driver.findElement(By.partialLinkText("Checkout")).click();
	}
	
	public static void login(WebDriver driver, String username, String password) throws InterruptedException {
		driver.findElement(By.cssSelector("input[id=username]")).sendKeys(username);
		driver.findElement(By.cssSelector("input[id=password]")).sendKeys(password);
		driver.findElement(By.xpath("//label[@class='customradio'][2]//span[@class='checkmark']")).click();
//		Thread.sleep(3);
		
//		Explicit wait
		Wait<WebDriver> w = new WebDriverWait(driver, Duration.ofSeconds(7));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		driver.findElement(By.xpath("//option[@value='consult']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
	}

}
