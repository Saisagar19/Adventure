package assign1;

public class AddTwo {

	private int num1;
	private int num2;

	public AddTwo(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	public int add() {
		return num1 + num2;
	}
	public static void main(String[] args) {
		AddTwo a = new AddTwo(5, 8);
		System.out.println("Addition of Two numbers: "+a.add());;
	}

}
