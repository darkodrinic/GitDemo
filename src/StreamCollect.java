import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamCollect {
	// Count the number of names starting with alphabet A in list
//	@Test
//	public void regular() {
//	ArrayList<String> names = new ArrayList<String>();
//	names.add("Aleksandar");
//	names.add("Darko");
//	names.add("Aco");
//	names.add("Adnan");
//	names.add("Goran");
//	int count = 0;
//	
//	for(int i =0; i<names.size(); i++) {
//		String actual = names.get(i);
//		if(actual.startsWith("A")) {
//			count++;
//		}
//	}
//	System.out.println(count);
//	}
	
//	@Test
//	public void streamFilter() {
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Aleksandar");
//		names.add("Darko");
//		names.add("Aco");
//		names.add("Adnan");
//		names.add("Goran");
//		
//		long c = names.stream().filter(s->s.startsWith("A")).count();
//		System.out.println(c);
//		
//		names.stream().filter(s->s.length()>6).forEach(s->System.out.println(s));
//		names.stream().filter(s->s.length()<6).limit(1).forEach(s->System.out.println(s));
//		
//			
//		}
	
//	@Test
//	// print names with have last letter as "a" with Uppercase
//	public void streamMap() {
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("man");
//		names.add("Don");
//		names.add("women");
//		
//		Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//		.forEach(s->System.out.println(s));
//		
//		// print names which have first letter as a with uppercase and sorted
//		List<String> names1 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
//		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
//		// merging two lists
//		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//		//newStream.forEach(s->System.out.println(s));
//		boolean flagStream = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
//		Assert.assertTrue(flagStream);
		
//	}
//	@Test
//	public void streamCollect() {
//		List<String> ls = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
//		.collect(Collectors.toList());
//		System.out.println(ls.get(0));
//	}
	@Test
	public void test() {
		List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);	
		// print unique names
		//values.stream().distinct().forEach(s->System.out.println(s));
		// sort the array
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
	}
		
	}
	

