package sorting;

import java.util.Scanner;

class Student {

	private int id;
	private String name;
	private int age;

	public Student() {
		this.id = 0;
		this.name = "";
		this.age = 0;
	}

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class SortingStudData {
	public static void bubbleSort(Student[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			boolean flag = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j].getAge() > arr[j + 1].getAge()) {
					Student temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
		}
	}

	public static void selectionSort(Student[] st) {
		for (int i = 0; i < st.length - 1; i++) {
			int min = i;
			for (int j = i+1; j < st.length; j++) {
//				if(st[j].getName().charAt(0) < st[min].getName().charAt(0))
				if (st[j].getId() < st[min].getId())
				{
					min = j;
				}
			}
			Student temp = st[i];
			st[i] = st[min];
			st[min] = temp;
		}
	}

	public static void insertionSort(Student st[]) {
		int i, j;
		for (i = 0; i < st.length; i++) {
			Student temp = st[i];
			for (j = i - 1; j >= 0 && temp.getAge() > st[j].getAge(); j--) {
				st[j + 1] = st[j];
			}
			st[j + 1] = temp;
		}
	}
	
	//insertion Sort using While
	
	public static void insertionSortV2(Student[] arr)
	{
		for(int i = 1; i < arr.length; i++)
		{
			Student curr = arr[i];
			int prev = i - 1;
			while(prev >=0 && arr[prev].getAge() > curr.getAge())
			{
				arr[prev + 1]= arr[prev];
				prev--;
			}
			arr[prev + 1] = curr;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Student Details: ");
		Student[] st = new Student[5];
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Enter Student id: ");
//			int id = sc.nextInt();
//
//			System.out.println("Enter Student name: ");
//			String nm = sc.next();
//
//			System.out.println("Enter Student age: ");
//			int age = sc.nextInt();
//
//			st[i] = new Student(id, nm, age);
//
//		}
		st[3] = new Student(4, "swayam", 42);
		st[4] = new Student(5, "digvijay", 17);
		st[0] = new Student(1, "sagar", 23);
		st[2] = new Student(3, "sidd", 63);
		st[1] = new Student(2, "amman", 20);

		for (Student i : st) {
			System.out.println(i);
		}

//		bubbleSort(st);
		selectionSort(st);
//		insertionSort(st);
//		insertionSortV2(st);
		System.out.println();
		for (Student i : st) {
			System.out.println(i);
		}

	}
}
