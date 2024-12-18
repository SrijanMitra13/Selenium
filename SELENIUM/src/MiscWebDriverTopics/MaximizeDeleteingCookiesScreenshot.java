package MiscWebDriverTopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeDeleteingCookiesScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		String fileName = null;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().deleteCookieNamed("asdf");
		
		driver.get("http://google.com");
		
		//Casting driver object to TaskesScreenshot method to take a screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("/Users/srijanmitra/Codes/Selenium/SELENIUM/src/MiscWebDriverTopics/Screenshot.jpg"));
		FileUtils.copyFile(src,new File("/Users/srijanmitra/Desktop/Screenshot.jpg"));
		
		Thread.sleep(5000);
		driver.quit();
	}

}
