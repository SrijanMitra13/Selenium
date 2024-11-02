package A_Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics2 {

	@Test
	public void ploan() {
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequesite() {
		System.out.println("I will execute first");
	}

}
