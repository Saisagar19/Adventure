package assign5;

public class Factorial extends Processor {

	public Factorial(int data) {
		super(data);
	}

	@Override
	public void process() {
		int fact = 1;

		for (int i = 1; i <= data; i++) 
		{
			fact *= i;
		}
		System.out.println("Fact : " + fact);

	}

	public static void main(String[] args) {
		Factorial f = new Factorial(5);
		f.process();
		f.showData();
	}

}
