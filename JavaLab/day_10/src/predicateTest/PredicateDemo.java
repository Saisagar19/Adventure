package predicateTest;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		Predicate<Integer> p = (x)-> x > 10;
		System.out.println(p.test(55)); // test() -> returns boolean

		Predicate<Integer> p1 = (x)-> x%2==0;
		System.out.println("And Condition: "+p.and(p1).test(55)); // and()-> works similar to logical &&
		
		System.out.println("OR Condition: "+p.or(p1).test(8));
		
		System.out.println("Negate Condition: "+p.and(p1.negate()).test(11));
	}	

}
