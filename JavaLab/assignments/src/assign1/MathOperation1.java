package assign1;

public class MathOperation1 {
	
	public void multiply(int n1,int n2)
	{
		int res = n1 * n2;
		System.out.println("Multiplication of two integers: "+res);
	}
	public void multiply(float n1, float n2)
	{
		float res = n1 * n2;
		System.out.println("Multiplication of two float: "+res);
	}
	public void multiply(int... a)
	{
		int res = 1;
		for(int i =0;i < a.length; i++)
		{
			res = a[i] * res;
		}
		for(int s : a)
		{
			System.out.print(s+" ");
		}
		System.out.println("\nMultiplication of given Array is: "+res);
	}
	public void multiply(double n1, int n2)
	{
		double res = n1 * n2;
		System.out.println("Multiplication of two double: "+res);
	}
	
	public static void main(String[] args) {
		MathOperation1 mp = new MathOperation1();
		mp.multiply(2, 5);
		mp.multiply(6.6, 5);
		mp.multiply(9.2f, 8.3f);
		mp.multiply(2,5,6);
	}
}
