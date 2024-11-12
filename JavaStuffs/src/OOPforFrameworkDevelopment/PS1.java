package OOPforFrameworkDevelopment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class PS1 extends PS{
	
	@Test
	public void testRun() {
		PS ps = new PS();
		ps.doThis();
		
		int a = 3;
		doThis();
		
		PS2 ps2 = new PS2(3); //Parameterized Constructor
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
//		PS3 ps3 = new PS3(3);
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
	}

}
