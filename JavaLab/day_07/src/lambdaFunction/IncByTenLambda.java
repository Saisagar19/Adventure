package lambdaFunction;

public class IncByTenLambda {

	public static void main(String[] args) {

//		IncrementByTen i = (x) -> {return (x + 10);};
		IncrementByTen i = (x) -> (x + 10);
	
		System.out.println(i.incByTen(20));
	}
}
