import java.util.Scanner;

public class LoopConcepts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
//		************************For Loops************************
		
//		for(int i = 0 ;i<3; i++)
//		{
//			for(int j = 0; j<3; j++)
//			{
//				System.out.print(i+","+j+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i = 1; i<=10;i++)
//		{
//			if(i%2 == 0)
//			{
//				continue;
//			}
//			else
//			{
//				System.out.println(i);
//			}
//		}
		
//		for(int i=0; i<3; i++)
//		{
//			for(int j = 0; j<3;j++)
//			{
//				if((i == 1) && (j == 1))
//				{
////					continue;
//					break;
//				}
//				else
//				{
//					System.out.print(i+","+j+" ");
//				}
//			}
//			System.out.println();
//		}
		
//		************************While Loops************************
		
//		System.out.println("Enter a Number: ");
//		int num = sc.nextInt();
//		int sum = 0;
//		while(num>0)
//		{
//			int rem = num%10;
//			sum += rem;
//			num/=10;
//		}
//		System.out.println("Sum of Digits: "+sum);
		
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		int term1 = 0;
		int term2 = 1;
		int nth = 0;
		
		System.out.print(term1+",");
		System.out.print(term2);
		
		for(int i = 1; i < num; i++)
		{
			nth = term1 + term2;
			term1 = term2;
			term2 = nth;
			System.out.print(","+nth);
//			if(nth == 8)
//			{
			
			
			
//				break;
//			}
		}
		
		
	}
}
