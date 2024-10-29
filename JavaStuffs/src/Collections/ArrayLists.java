package Collections;

import java.util.ArrayList;

public class ArrayLists {
// All classes that implements list interfaces will accept duplicate values

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rahul");
		al.add("Java");
		
		System.out.println(al);
		
		al.add(0, "student");
		System.out.println(al);
		
		/*
		al.remove(1);
		al.remove("java");
		System.out.println(al);*/
		
		System.out.println(al.get(2));
		System.out.println(al.contains("testing"));
		
		System.out.println(al.indexOf("Rahul"));
		System.out.println(al.isEmpty());
		System.out.println(al.size());
	}

}
