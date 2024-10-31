package Collections;

import java.util.HashSet;
import java.util.Iterator;


public class Iterators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
