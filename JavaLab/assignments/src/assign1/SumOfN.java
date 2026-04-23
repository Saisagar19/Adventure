package assign1;

import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the last number to calculate sum(1 to ?):");
        int num = s.nextInt();      
        sum = num*(num+1)/2;
        System.out.println("Sum of 1 to " + num + " is: " + sum);
        s.close();
	}

}
