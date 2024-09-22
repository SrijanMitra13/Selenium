package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		
//		int numberOfClicks =1;
//		while(numberOfClicks<5) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//			numberOfClicks++;
//		}
		
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		String numOfPassengers = driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(numOfPassengers);
		
		Thread.sleep(3000);
		driver.quit();

	}

}
