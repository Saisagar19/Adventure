package assign6.campus.accounts;

import assign6.campus.academics.Student;

public class Fees {

	private Student student;
	private double amount;
	private String paymentDate;

	public Fees(Student student, double amount, String paymentDate) {
		super();
		this.student = student;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Fees [student=" + student + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}

}
