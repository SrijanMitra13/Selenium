package A_Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basics3 {
	@Test
	public void webLoginCarLoan() {
		//selenium
		System.out.println("weblogincar");
	}
	
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will execute before every test method in basics3 class");
	}
	
	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after every test method in basics3 class");
	}
	
	@Test
	public void mobileLoginCarLoan() {
		//Appium
		System.out.println("Mobile login car");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am no 1");
	}
	
	@Test
	public void mobileSignInCarLoan() {
		//Appium
		System.out.println("Mobile SignIn car");
	}
	
	@Test
	public void mobileSignOutCarLoan() {
		//Appium
		System.out.println("Mobile SignOut car");
	}
	
	@Test
	public void APICarLoan() {
		//Rest API automation
		System.out.println("APIlogincar");
	}
}
