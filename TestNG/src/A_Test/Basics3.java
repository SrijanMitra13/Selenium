package A_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before executing any method in the class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After executing any method in the class");
	}
	
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname) {
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
	}
	
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("I will execute before every test method in basics3 class");
	}
	
	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after every test method in basics3 class");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan() {
		//Appium
		System.out.println("Mobile login car");
	}
	
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void mobileSignInCarLoan() {
		//Appium
		System.out.println("Mobile SignIn car");
	}
	
	@Test(timeOut=4000)
	public void mobileSignOutCarLoan() {
		//Appium
		System.out.println("Mobile SignOut car");
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileSignOutCarLoan"})
	public void APICarLoan() {
		//Rest API automation
		System.out.println("APIlogincar");
	}
}
