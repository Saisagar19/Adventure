package functionJava;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String [] args)
	{
		Function<Integer, Double> f = (x)-> Math.sqrt(x);	// It takes two parameter one for Input and Other for output
		System.out.println(f.apply(64));	// There is one method name as apply() where we pass input
		
		Function<String, String> f1 = (a)-> a.toLowerCase();
		System.out.println(f1.apply("SAGAR"));
		
		Function<String, String> f2 = (i)-> i.toLowerCase()+" "+i.toUpperCase();
		System.out.println(f2.apply("SaGaR"));
		
		Function<String, Integer> f3 = (z) -> z.length();
		System.out.println(f3.apply("Saisagar"));
	}

}
