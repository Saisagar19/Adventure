package recursion;

public class Recursion {

	public static int factorial(int num) {
		if (num < 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}
	
	public static int sumOfDigit(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		return num%10 + sumOfDigit(num/10);
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(sumOfDigit(123));

	}
	
//	1 - sorting user defined book using bubble/slelction/insertion ----->10
//	2 - recusion ---> palindrom/sumOfDigit/fibo/factorial/reverse linkedlist/search bst/ find height bst ---->10
//	3 - linkedlist/bst ---> insertion/ deletion 6 ways , insertion bst, search bst, find height ----> 20 

}
