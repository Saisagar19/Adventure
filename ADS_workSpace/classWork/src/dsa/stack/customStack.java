package dsa.stack;

class strStack {

	private String[] str;
	private int top;

	public strStack() {
		str = new String[10];
		top = -1;
	}

	public strStack(int size) {
		str = new String[size];
		top = -1;
	}

	public boolean isFull() {
		if (top == str.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(String data) {
		if (!isFull()) {
			top++;
			str[top] = data;
			return;
		}
	}

	public String pop() {
		if (!isEmpty()) {
			String s = str[top];
			top--;
			return s;
		}
		return null;
	}

	public String peek() {
		if (!isEmpty()) {
			return str[top];
		}
		return null;
	}

}

class intStack {

	private int[] arr;
	private int top;

	public intStack() {
		arr = new int[10];
		top = -1;
	}

	public intStack(int size) {
		arr = new int[size];
		top = -1;
	}

	public boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(int num) {
		if (!isFull()) {
			top++;
			arr[top] = num;

		}
		return;
	}

	public int pop() {
		int num = -999;
		if (!isEmpty()) {
			num = arr[top];
			top--;
			return num;
		}
		return num;
	}

	public int peek() {
		int num = -999;
		if (!isEmpty()) {
			return arr[top];
		}
		return num;
	}

}

class charStack {

	private char[] arr;
	private int top;

	public charStack() {
		arr = new char[10];
		top = -1;
	}

	public charStack(int size) {
		arr = new char[size];
		top = -1;
	}

	public boolean isFull() {
		if (top == arr.length - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void push(char ch) {
		if (!isFull()) {
			top++;
			arr[top] = ch;

		}
		return;
	}

	public char pop() {
		char d = '*';
		if (!isEmpty()) {
			d = arr[top];
			top--;
			return d;
		}
		return d;
	}

	public char peek() {
		char d = '*';
		if (!isEmpty()) {
			return arr[top];
		}
		return d;
	}

}
