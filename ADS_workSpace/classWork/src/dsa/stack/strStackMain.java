package dsa.stack;

import java.util.Scanner;

public class strStackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();
		strStack st = new strStack(size);
		char ch;
		String n;
		do {
			System.out.println("For String:");
			System.out.println(
					"1.Push in Stack\n2.Pop from stack\n3.Peek an Element from Stack\n4.Check for Stack is Empty\n5.Check for Stack is Full.\n6.Exit");
			ch = sc.next().charAt(0);
			switch (ch) {
			case '1':
				System.out.println("Enter Your Character: ");
				String str = sc.next();
				st.push(str);
				break;
			case '2':
				n = st.pop();
				System.out.println("Poped Element " + n);
				break;
			case '3':
				n = st.peek();
				System.out.println("Peek Element " + n);
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
