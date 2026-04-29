package dsa.stack;

import java.util.Scanner;

class intStack {
    private int[] arr;
    private int top;

    public intStack(int size) {
        arr = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int num) {
        if (!isFull()) {
            arr[++top] = num;
        }
    }

    public int pop() {
        if (!isEmpty()) {
            return arr[top--];
        }
        return -999;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -999;
    }
}

class charStack {
    private char[] arr;
    private int top;

    public charStack(int size) {
        arr = new char[size];
        top = -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(char ch) {
        if (!isFull()) {
            arr[++top] = ch;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return arr[top--];
        }
        return '*';
    }

    public char peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return '*';
    }
}

class strStack {
    private String[] arr;
    private int top;

    public strStack(int size) {
        arr = new String[size];
        top = -1;
    }

    public boolean isFull() {
        return top == arr.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(String data) {
        if (!isFull()) {
            arr[++top] = data;
        }
    }

    public String pop() {
        if (!isEmpty()) {
            return arr[top--];
        }
        return null;
    }

    public String peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return null;
    }
}

public class customStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Stack: ");
        int size = sc.nextInt();

        strStack st = new strStack(size);
        char ch;

        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.IsEmpty\n5.IsFull\n6.Exit");
            ch = sc.next().charAt(0);

            switch (ch) {
                case '1':
                    System.out.println("Enter String:");
                    String str = sc.next();
                    st.push(str);
                    break;

                case '2':
                    System.out.println("Popped: " + st.pop());
                    break;

                case '3':
                    System.out.println("Peek: " + st.peek());
                    break;

                case '4':
                    System.out.println("Is Empty: " + st.isEmpty());
                    break;

                case '5':
                    System.out.println("Is Full: " + st.isFull());
                    break;

                case '6':
                    break;

                default:
                    System.out.println("Invalid input");
            }

        } while (ch != '6');

        sc.close();
    }
}