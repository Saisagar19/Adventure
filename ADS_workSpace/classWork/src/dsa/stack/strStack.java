package dsa.stack;

public class strStack {

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

	public String push(String data) {
		if (!isFull()) {
			str[0] = data;
		}
		return;
	}

}
