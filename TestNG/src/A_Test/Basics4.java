package A_Test;

import org.testng.annotations.Test;

public class Basics4 {
	@Test
	public void webLoginHomeLoan() {
		//selenium
		System.out.println("webloginhome");
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
