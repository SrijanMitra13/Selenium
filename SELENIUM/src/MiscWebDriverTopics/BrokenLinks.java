package MiscWebDriverTopics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		SoftAssert a = new SoftAssert();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		
//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//		
//		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode =conn.getResponseCode();
//		System.out.println(respCode);
		
		//Step1- get all urls tied up to the links using selenium
		List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		for(WebElement link: links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with text " + link.getText() + " is broken with code " + respCode);
		}
		a.assertAll();
		
		Thread.sleep(5000);
		driver.quit();
	}

}
