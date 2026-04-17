package assign4;

import java.util.Scanner;

public class XYZbhk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TwoBHK arr [] = new TwoBHK[2];
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println("Enter area 1: ");
			double area1 = sc.nextDouble();
			System.out.println("Enter area 2: ");
			double area2 = sc.nextDouble();
			System.out.println("Enter Hall Area: ");
			double hallArea = sc.nextDouble();
			System.out.println("Enter Price: ");
			double p = sc.nextDouble();
			
			arr[i] = new TwoBHK(area1,area2,hallArea, p);
		}
		
		for(TwoBHK t : arr)
		{
			System.out.println(t);
		}
		
//		TwoBHK b1 = new TwoBHK(478.33,458.66,55.6, 892500.00);
//		b1.show();
//		TwoBHK b2 = new TwoBHK(600.33,356.66,55.6, 792500.00);
//		b2.show();
//		TwoBHK b3 = new TwoBHK(500.33,600.66,70.6, 992500.00);
//		b3.show();
		
		double totalAmt = 0;
		for(int i = 0; i < arr.length; i++)
		{
			totalAmt += arr[i].getPrice();
		}
//		double totalAmt = b1.getPrice() + b2.getPrice() + b3.getPrice();
		System.out.println("The total amount of all flats: "+totalAmt);
	}

}
