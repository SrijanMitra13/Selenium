package A_Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
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
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String urlname, String key) {
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
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
	
	@Test(dataProvider="getData")
	public void mobileSignOutCarLoan(String username, String password) {
		//Appium
		System.out.println("Mobile SignOut car");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"webLoginCarLoan","mobileSignOutCarLoan"})
	public void APICarLoan() {
		//Rest API automation
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st Combination - username password
		//2nd 		"	- username password - no credit history
		//3rd 		"	- fraudulent credit history
		
		Object[][] data = new Object[3][2];
		//1st Set
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		//2nd Set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd Set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
}
