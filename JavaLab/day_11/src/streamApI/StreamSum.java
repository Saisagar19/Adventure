package streamApI;

import java.util.Arrays;
import java.util.List;

public class StreamSum {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,59,87,74,56);
		
		int max = list.stream().map(x->x).reduce(0,Integer::max);
		int min = list.stream().map(x->x).reduce(Integer::min).get();
		int sum = list.stream().filter(x -> x%2==0).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
	}

}
