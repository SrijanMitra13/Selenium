package A_Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Basics {
	
	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
	}
	
	@Test
	public void demo() {
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afSuite() {
		System.out.println("I am the no1 from last");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Bye");
	}
}
