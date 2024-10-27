package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_DateClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Current Date..Current Time
		Date d = new Date();
		System.out.println(d.toString());
		
		//Getting the output in a customised format
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
	}

}
