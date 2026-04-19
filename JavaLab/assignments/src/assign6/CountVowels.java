package assign6;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String name = sc.nextLine();
		
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		char[] nm = name.toLowerCase().toCharArray();
//		char[] vowels = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };
//		char[] nm = name.toCharArray();
		int count = 0;
		for (int i = 0; i < nm.length; i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (nm[i] == vowels[j]) {
					count++;
				}
			}
		}
		System.out.println("Count of vowels: " + count);
		sc.close();
	}
}
