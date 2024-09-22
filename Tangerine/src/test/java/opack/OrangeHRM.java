package opack;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	@Test
	public void orangeMethod() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		// Opening the Login Page
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Checking if the user is there in the login page
		String loginText = driver.findElement(By.xpath("//h5[@class = 'oxd-text oxd-text--h5 orangehrm-login-title']")).getText();
		System.out.println(loginText);
		
		//Entering Username
		WebElement Username = driver.findElement(By.xpath("//input[@name = 'username']"));
		Username.sendKeys("Admin");
		System.out.println("Username Entered");
		
		//Entering Password
		WebElement Password = driver.findElement(By.xpath("//input[@name = 'password']"));
		Password.sendKeys("admin123");
		System.out.println("Password Entered");
		
		
		//Click Login
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
		LoginButton.click();

		
		//Click on Recruitment
		WebElement recruitment = driver.findElement(By.linkText("Recruitment"));
		recruitment.click();

		
		//Checking if user has landed on the Recruitment page or not
		String recruitmentText = driver.findElement(By.xpath("//h6[@class = 'oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
		System.out.println(recruitmentText);
		
		//Click on Reset
		WebElement resetBtn = driver.findElement(By.xpath("//button[@type = 'reset']"));
		resetBtn.click();
		
		//Clicking on Vacancy and selecting "Associate IT Manager"
		String vacancyPath = "//div[@class = 'oxd-grid-item oxd-grid-item--gutters'][2]/descendant::div[@class='oxd-select-text-input']";
		WebElement vacancySelect = driver.findElement(By.xpath(vacancyPath));
		vacancySelect.click();
		vacancySelect.sendKeys("a");
		vacancySelect.click();
		
		//Click Submit
		Actions a = new Actions(driver);
		WebElement searchBtn = driver.findElement(By.xpath("//button[@type = 'submit']"));
		a.moveToElement(searchBtn).perform();
		a.click(searchBtn).perform();
		
		//Navigate to User in the Top right corner
		WebElement usr = driver.findElement(By.xpath("//*[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		usr.click();
		
		//Click Logout
		WebElement logout = driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/descendant::a[text()='Logout']"));
		logout.click();
		
		//Check if the user has returned back to the login page
//		String loginText = driver.findElement(By.xpath("//h5[@class = 'oxd-text oxd-text--h5 orangehrm-login-title']")).getText();
		System.out.println(loginText);
		
		Thread.sleep(10000);
		driver.quit();
	}

}
