package AjaxCalls_ChildWindows_iFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C_Frames_DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//Count the number of frames in a webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//Switching to iframe
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class=demo-frame]")));
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("draggable")).click();
		
		//Drag and Drop
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//Switching out of frame to click another element
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.quit();

	}

}
