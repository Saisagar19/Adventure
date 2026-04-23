package assign8;

import java.util.Arrays;
import java.util.List;

//Find Even Number using Stream
//Convert list of String to uppercase
//Find maximum number
//Count strings with length greater than 3
//Sort employees by name using comparator
//Remove duplicate elements from the list of integer/String
//Find sum of all elements
//Find first element from the list of Integer/String
public class StreamAssign {
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(2,8,2,3,4,9,12);
		num.stream().filter(i-> i%2==0).forEach(System.out::println);
		
		List<String> data = Arrays.asList("om","sagar","sam","AaDitya");
		data.stream().map(i->i.toUpperCase()).forEach(System.out::println);
		
		Integer max = num.stream().reduce(0,Integer::max);
		System.out.println(max);
		
		data.stream().filter(i->i.length()>3).forEach(System.out::println);
		
		int sum = num.stream().map(x->x).reduce(0,Integer::sum);
		System.out.println("Sum: "+sum);
		
		num.stream().findFirst().ifPresent(System.out::println);
		
		data.stream().findFirst().ifPresent(System.out::println);
		
	}

}
