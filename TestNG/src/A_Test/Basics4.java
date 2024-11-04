package A_Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics4 {
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String uname) {
		//selenium
		System.out.println("webloginhome");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginHomeLoan() {
		//Appium
		System.out.println("Mobileloginhome");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		//Rest API automation
		System.out.println("APIloginhome");
	}
}
