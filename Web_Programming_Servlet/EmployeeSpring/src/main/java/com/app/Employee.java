package com.app;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private Date date;

	public Employee() {

	}

	public Employee(Date date) {
		super();
		this.date = date;
	}

	public Employee(int id, String name, double salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + "]";
	}

}
