package dsa.stack;

public class charStack {

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
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}

	public void push(char ch) 
	{
		if(!isFull())
		{
			top++;
			arr[top] = ch;
			
		}
		return;
	}
	
	public char pop()
	{
		char d = '*';
		if(!isEmpty())
		{
			d = arr[top];
			top--;
			return d;
		}
		return d;
	}
	
	public char peek()
	{
		char d = '*';
		if(!isEmpty())
		{
			return arr[top];
		}
		return d;
	}

}

