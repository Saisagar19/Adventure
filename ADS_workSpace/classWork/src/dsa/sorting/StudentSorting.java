package dsa.sorting;

public class StudentSorting {

	public static void bubbleSort(Student[] st) {
		for (int i = st.length - 1; i > 0; i--) {
			boolean flag = false;
			for (int j = 0; j <= i - 1; j++) {
				if (st[j].getName().charAt(0) > st[j + 1].getName().charAt(0)) {
					Student temp = st[j];
					st[j] = st[j + 1];
					st[j + 1] = temp;
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
			for (int j = i; j < st.length; j++) {
				if (st[j].getAge() < st[min].getAge()) {
					min = j;
				}
			}
			Student temp = st[i];
			st[i] = st[min];
			st[min] = temp;
		}
	}

	public static void main(String[] args) {
		Student[] st = new Student[5];
		st[0] = new Student(1, "sagar", 23);
		st[1] = new Student(2, "amman", 20);
		st[2] = new Student(3, "sidd", 63);
		st[3] = new Student(4, "swayam", 42);
		st[4] = new Student(5, "digvijay", 17);

//		bubbleSort(st);
		selectionSort(st);
		for (Student i : st) {
			System.out.print(i + " ");
			System.out.println();
		}
	}

}
