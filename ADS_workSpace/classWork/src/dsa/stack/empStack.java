package dsa.stack;

import dsa.Employee;

public class empStack {

	private Employee[] emp;
	private int top;

	public empStack() {
		emp = new Employee[10];
		top = -1;
	}

	public empStack(int size) {
		emp = new Employee[size];
		top = -1;
	}

	public boolean isFull() {
		if (top == emp.length - 1) {
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

	public void push(Employee e) {
		if (!isFull()) {
			top++;
			emp[top] = e;
			return;
		}
		System.out.println("Stack is full");
	}
	
	public Employee pop()
	{
		Employee e = new Employee(0,"NA",0.00d);
		if(!isEmpty())
		{
			e = emp[top];
			top--;
			return e;
		}
		System.out.println("Stack is Empty......");
		return e;
	}
	
	public Employee peek()
	{
		Employee e = new Employee(0,"NA",0.00d);
		if(!isEmpty())
		{
			e = emp[top];
			return e;
		}
		System.out.println("Stack is Empty......");
		return e;
	}

}
