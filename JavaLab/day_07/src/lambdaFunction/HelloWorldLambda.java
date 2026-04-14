package lambdaFunction;

public class HelloWorldLambda {

	public static void main(String[] args) {
		
//		HelloWorldInterface h = () -> {return "Hello World";};
		HelloWorldInterface h = () -> "Hi I am Saisagar";
		System.out.println(h.sayHello());
	}
}
