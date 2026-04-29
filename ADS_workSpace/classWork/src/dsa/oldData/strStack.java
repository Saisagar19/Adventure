package dsa.oldData;

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

	public void push(String data) {
		if (!isFull()) {
			top++;
			str[top] = data;
			return;
		}
	}
	public String pop()
	{
		if(!isEmpty())
		{
			String s = str[top];
			top--;
			return s;
		}
		return null;
	}
	
	public String peek()
	{
		if(!isEmpty())
		{
			return str[top];
		}
		return null;
	}

}
