package assign5;

public class Circle extends Processor{

	public Circle(int data) {
		super(data);
	}

	@Override
	public void process() {
		double area = 3.14 * data * data;
		System.out.println("Area of Circle: "+area);
	}
	public static void main(String[] args) {
		Circle c = new Circle(8);
		c.process();
		c.showData();
	}

}
