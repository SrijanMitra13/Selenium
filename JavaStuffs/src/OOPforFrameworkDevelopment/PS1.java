package OOPforFrameworkDevelopment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PS1 extends PS{
	
	@Test
	public void testRun() {
		PS ps = new PS();
		ps.doThis();
		
		doThis();
	}

}
