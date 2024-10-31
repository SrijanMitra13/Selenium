package Collections;

import java.util.HashSet;

public class hashSet {
//Set interface does not accept duplicate values
//Elements may not be in sequential order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		System.out.println(hs);
		
		System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
	}

}
