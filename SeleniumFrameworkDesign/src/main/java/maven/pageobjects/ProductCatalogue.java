package maven.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven.AbstractComponents.AbstractComponents;

public class ProductCatalogue extends AbstractComponents{
	
	WebDriver driver;
	
	public ProductCatalogue(WebDriver driver) {
		//initialization
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
	
	//PageFactory
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	By productsBy = By.cssSelector(".mb-3");
	
	public List<WebElement> getProductList() {
		
		waitForElementToAppear(productsBy);
		return products;
	}
}
