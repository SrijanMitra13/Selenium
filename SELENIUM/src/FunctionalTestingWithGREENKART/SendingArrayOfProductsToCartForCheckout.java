package FunctionalTestingWithGREENKART;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendingArrayOfProductsToCartForCheckout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Pumpkin"};
		int j=0;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0; i<products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			List  itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedName)) {
				j++;
				//click on Add To Cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				
				if(j==itemsNeeded.length) {
					break;
				}
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
