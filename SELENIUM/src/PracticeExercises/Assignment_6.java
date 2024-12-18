package PracticeExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Selecting check box and grabbing the text
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
//		System.out.println(option);
		
		//Selecting the correct option from grabbed text
		WebElement dropdownOption=driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropdownOption);
		s.selectByVisibleText(option);
		
		//Sending the grabbed text to the alert box
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		
		String text = driver.switchTo().alert().getText();
		if(text.contains(option)) {
			System.out.println("Alert message successful!");
		} else {
			System.out.println("Something wrong with execution!");
		}
		
		Thread.sleep(5000);
		driver.quit();
	}

}
