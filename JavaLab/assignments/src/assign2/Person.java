package assign2;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		this.age = 18;
	}
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "[Name: "+name+" Age: "+age+" ]";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person p = new Person();
		System.out.println(p);
		System.out.println("Enter Name: ");
		String nm = sc.nextLine();
		System.out.println("Enter Age: ");
		int ag = sc.nextInt();
		Person p1 = new Person(nm, ag);
		System.out.println(p1);
		sc.close();
	}
}
