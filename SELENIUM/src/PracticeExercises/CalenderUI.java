package PracticeExercises;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String monthNumber = "6";
		String date = "15";
		String year = "2027";
		String[] expectedList = {monthNumber, date, year};
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		// Clicking on date picker - calender appears
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		
		// Clicking on Month-Year - months appear
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		// Clicking again in the same place - years appear
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		
		// Clicking on the required year - 2027 in this case - months appear
		driver.findElement(By.xpath("//button[contains(text(),'"+year+"')]")).click();
		
		//CLicking on the required month - June in this case
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		
		// CLicking on the date - 15 in this case
		driver.findElement(By.xpath("//abbr[contains(text(),'"+date+"')]")).click();
		
		//Getting the text out of the selected date
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0; i<actualList.size(); i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);
		}
		
		Thread.sleep(5000);
		driver.quit();

	}

}
