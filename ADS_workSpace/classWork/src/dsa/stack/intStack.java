package dsa.stack;

public class intStack {

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
	
	public boolean isEmpty()
	{
		if(top == -1)
		{
			return true;
		}
		return false;
	}

	public void push(int num) 
	{
		if(!isFull())
		{
			top++;
			arr[top] = num;
			
		}
		return;
	}
	
	public int pop()
	{
		int num = -999;
		if(!isEmpty())
		{
			num = arr[top];
			top--;
			return num;
		}
		return num;
	}
	
	public int peek()
	{
		int num = -999;
		if(!isEmpty())
		{
			return arr[top];
		}
		return num;
	}

}
