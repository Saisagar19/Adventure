package dsa.stack;

import java.util.Scanner;

public class intStackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack: ");
		int size = sc.nextInt();
		intStack st = new intStack(size);
		char ch;
		int num;
		do {
			System.out.println("For Integer:");
			System.out.println(
					"1.Push in Stack\n2.Pop from stack\n3.Peek an Element from Stack\n4.Check for Stack is Empty\n5.Check for Stack is Full.\n6.Exit");
			ch = sc.next().charAt(0);
			switch (ch) {
			case '1':
				System.out.println("Enter Your Number: ");
				int no = sc.nextInt();
				st.push(no);
				break;
			case '2':
				num = st.pop();
				System.out.println("Poped Element " + num);
				break;
			case '3':
				num = st.peek();
				System.out.println("Peek Element " + num);
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
