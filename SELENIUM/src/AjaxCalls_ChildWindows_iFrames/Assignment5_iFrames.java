package AjaxCalls_ChildWindows_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5_iFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		nestedFrames(driver);
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	public static void nestedFrames(WebDriver driver) {
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
