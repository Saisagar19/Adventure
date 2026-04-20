package assign7.StudentManagementSyst;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Q4. Online Shopping Cart (30 Marks) Write a Java program to simulate a
 * shopping cart. Create a Product class with: int pid, String name, double
 * price. (5 Marks) Maintain a Map<Integer, Product> as the product catalog. (5
 * Marks) Allow the user to add products to a Cart (List<Product>). (5 Marks)
 * Display the contents of the cart with total price. (5 Marks) Remove a product
 * from the cart by ID. (5 Marks) Maintain the last 3 actions (add/remove) in a
 * Stack and display the undo history. (5 Marks)
 */

public class TestProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Product> h = new HashMap<Integer, Product>();
		System.out.println("How Many products you want to enter: ");
		int d = sc.nextInt();

		List<Product> cart = new ArrayList<Product>();
		for (int i = 0; i < d; i++) {
			System.out.println("Enter Product Id: ");
			int id = sc.nextInt();
			System.out.println("Enter Product Name: ");
			String nm = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Product Price: ");
			double price = sc.nextInt();

			h.put((i + 1), new Product(id, nm, price));
		}
		System.out.println(h);
		
		Collection<Product> list = h.values();
//		h.put(1, new Product(1, "ChocoLava", 220));
//		h.put(2, new Product(2, "Cake", 150));
//		h.put(3, new Product(3, "Kur-kure", 10));
//		h.put(4, new Product(4, "Chips", 20));
//		h.put(5, new Product(5, "Puff", 50));
		

	}

}
