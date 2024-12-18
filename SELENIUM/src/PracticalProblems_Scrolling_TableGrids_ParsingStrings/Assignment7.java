package PracticalProblems_Scrolling_TableGrids_ParsingStrings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		//Print the number of rows of the table
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		
		//Another way
//		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		
		
		//Another way
//		List<WebElement> rowsNum =driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
//		int count =0;
//		for(int i = 0; i< rowsNum.size(); i++) {
//			count=count+1;
//		}
//		System.out.println(count);
		
		
		//Print the headers
//		List<WebElement> headers = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[1]/th"));
//		for(int i=0; i<headers.size(); i++) {
//			System.out.println(headers.get(i).getText());
//		}
		
		//Print the number of columns of the table
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//Print the elements of the second row
		List<WebElement> secondRow =table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		for(int i = 0; i<secondRow.size(); i++) {
			System.out.println(secondRow.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
