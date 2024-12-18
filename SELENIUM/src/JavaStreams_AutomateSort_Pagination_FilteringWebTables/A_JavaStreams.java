package JavaStreams_AutomateSort_Pagination_FilteringWebTables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class A_JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alakhya");
		names.add("Adam");
		names.add("Rama");
		
		//Count the number of names that starts with A
		long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//Counting the number of names that starts with A without creating a collection
		long d = Stream.of("Abhijeet","Don","Alakhya","Adam","Ram").filter(s->
		{
			return s.startsWith("A");
			
		}).count();
		System.out.println(d);
		
		//Print all the names of the ArrayList where length of the name greater than 4
		long e = names.stream().filter(s->s.length()>4).count();
		System.out.println(e);
		
		//Printing the names of the ArrayList where length of the name greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//Printing the first result of the ArrayList where length of the name greater than 4
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//Introducing Map
		//Print the names with last letter "a" with Uppercase
		Stream.of("Abhijeet","Don","Alakhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Print the names with last letter "A" with Uppercase and sorted
		List<String> names1 = Arrays.asList("Azbhijeet","Don","Alakhya","Adam","Rama");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		//Calling merge
		streamMerge();
		//Calling match
		streamAnyMatch();
		streamCollect();
		integers();
		
	}
	
	public static void streamMerge() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		List<String> names1 = Arrays.asList("Azbhijeet","Don","Alakhya","Adam","Rama");
		//Merging names and names1 with stream.concat
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.forEach(s->System.out.println(s));
	}
	
	public static void streamAnyMatch() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("man");
		names.add("Don");
		names.add("women");
		
		List<String> names1 = Arrays.asList("Azbhijeet","Don","Alakhya","Adam","Rama");
		//Merging names and names1 with stream.concat
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		//Finding weather "Adam" is present or not in the merged ArrayList
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	public static void streamCollect() {
		List<String> ls = Stream.of("Abhijeet","Don","Alakhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
	}

	public static void integers() {
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
		
		//print unique numbers
		values.stream().distinct().forEach(s->System.out.println(s));
		
		//sort the array
		System.out.println("*********************************************");
		values.stream().sorted().forEach(s->System.out.println(s));
		
		//sort and print the 3rd index
		System.out.println("*********************************************");
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}

}
