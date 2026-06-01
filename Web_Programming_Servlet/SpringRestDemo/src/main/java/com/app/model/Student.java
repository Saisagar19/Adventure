package com.app.model;

public class Student {

	private int id;
	private String firstname;
	private String lastnmae;
	private boolean active;

	public Student() {
	}

	public Student(int id, String firstname, String lastnmae, boolean active) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastnmae = lastnmae;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastnmae() {
		return lastnmae;
	}

	public void setLastnmae(String lastnmae) {
		this.lastnmae = lastnmae;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastnmae=" + lastnmae + ", active=" + active + "]";
	}

}
