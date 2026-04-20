package day_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Demo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(11,55,87,96,45,23);
		
		list.stream().forEach(System.out::println);
		System.out.println("-------------------------");
		int sum = IntStream.of(55,87,96,45).sum();
		System.out.println(sum);
		System.out.println("-------------------------");
		int total = IntStream.rangeClosed(1, 10).sum();
		System.out.println(total);
		System.out.println("-------------------------");
		
		int t = list.stream().filter(x-> x%2!=0).map(x->x*3).reduce(0, Integer::sum);
		System.out.println("Sum of odd number: "+t);
		
		long c = list.stream().count();
		System.out.println("Count: "+c);
		
	}

}
