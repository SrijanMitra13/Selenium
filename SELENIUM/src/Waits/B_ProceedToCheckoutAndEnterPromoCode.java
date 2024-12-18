package Waits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B_ProceedToCheckoutAndEnterPromoCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Pumpkin" };

		WebDriver driver = new ChromeDriver();
		
		// Applying Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		addItems(driver, itemsNeeded);
		checkoutProcess(driver);
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded) {
		int j = 0;
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {
				j++;
				// click on Add To Cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}
	
	public static void checkoutProcess(WebDriver driver) {
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		
		//Implicit wait will invoke here
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit wait will invoke here
		Wait<WebDriver> w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		String promoInfo = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(promoInfo);
	}
}
