package dsa.stack;

import java.util.Scanner;

import dsa.Employee;

public class empStackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();
		empStack st = new empStack(size);
		
		char ch;
		Employee e = new Employee();
		do {
			System.out.println("For Employee:");
			System.out.println(
					"1.Push in Stack\n"
					+ "2.Pop from stack\n"
					+ "3.Peek an Element from Stack"
					+ "\n4.Check for Stack is Empty"
					+ "\n5.Check for Stack is Full.\n6.Exit");
			ch = sc.next().charAt(0);
			switch (ch) {
			case '1':
				System.out.println("Enter emp id: ");
				int no = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter emp name: ");
				String nm = sc.nextLine();
				System.out.println("Enter emp salary: ");
				double dn = sc.nextInt();
				st.push(new Employee(no, nm, dn));
				break;
			case '2':
				e = st.pop();
				System.out.println("Poped Element " + e);
				break;
			case '3':
				e = st.peek();
				System.out.println("Peek Element " + e);
				break;
			case '4':
				System.out.println("Stack is Empty..... " + st.isEmpty());
				break;
			case '5':
				System.out.println("Stack is Full..... " + st.isFull());
				break;
			case '6':
				break;
			default:
				System.out.println("Enter valid number");

			}
		} while (ch != '6');

		sc.close();
	}
}
