package lambdaFunction;

public class StringConcatLambda {

	public static void main(String[] args) {
		StringConcat sc = (x, y) -> {
			return x.concat(y);
		};
		System.out.println(sc.strConcat("Happy ", "Holi"));

	}

}
