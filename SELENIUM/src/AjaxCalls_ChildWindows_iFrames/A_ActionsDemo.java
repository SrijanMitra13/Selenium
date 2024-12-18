package AjaxCalls_ChildWindows_iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		WebElement signIn =driver.findElement(By.id("nav-link-accountList"));
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		Actions a = new Actions(driver);
		
		
		textInputInSearchBox(driver, a, searchBox);
		actionsClassDemo(driver, signIn, a);
		contextCLick(driver, signIn, a);
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	//Moves to a specific element
	public static void actionsClassDemo(WebDriver driver, WebElement signIn, Actions a) {
		a.moveToElement(signIn).build().perform();	
	}
	
	//Entering test in then search box in all Caps
	public static void textInputInSearchBox(WebDriver driver, Actions a, WebElement searchBox) {
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	}
	
	//Right click on SignIn button
	public static void contextCLick(WebDriver driver, WebElement signIn, Actions a) {
		a.moveToElement(signIn).contextClick().build().perform();
	}

}
