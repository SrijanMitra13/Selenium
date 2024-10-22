package JavaStreams_AutomateSort_Pagination_FilteringWebTables;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class B_WebTableSorting_Pagination {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		
		Set<String> windows = driver.getWindowHandles(); // [parentId, childId]
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		Thread.sleep(2000);
		
		//Click on the column to sort the veggies
		driver.findElement(By.xpath("//span[contains(text(),'Veg/fruit name')]")).click();
		
		//Capture all the WebElements into the list
		List<WebElement> elementsList= driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text of all WebElements into new(original) list
		List<String> originalList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort on originalList of the above step
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price;
		//Scan the name column with getText -> Rice -> print the price of the rice
		do {
			List<WebElement> rows= driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
			price.forEach(a->System.out.println(a));
		
			if(price.size()<1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}
		}while(price.size()<1);
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static String getPriceVeggie(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
