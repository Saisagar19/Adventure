package assign7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*Q2. Library Book Management (30 Marks)
	Write a Java program to manage books in a library.
	Create a Book class with: String isbn, String title, String author, int copies. (5 Marks)
	Store at least 6 books in a HashMap<String, Book> keyed by ISBN. (5 Marks)
	Allow the user to search for a book by ISBN and display its details. (5 Marks)
	Allow the user to borrow a book:
		Decrease the copies count if available.
		If no copies are available, add the user to a waiting list (Queue). (5 Marks)
	Display all books in sorted order by title using a TreeSet. (5 Marks)
	Display the list of users waiting for each book (if any). (5 Marks)
*/
public class TestBook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Store at least 6 books in a HashMap<String, Book> keyed by ISBN.
		HashMap<String, Book> h = new HashMap<>();
		h.put("1", new Book("1", "Harry Potter", "J.K Rowling", 6));
		h.put("2", new Book("2", "Ikegai", "Sukuna D. Geto ", 2));
		h.put("3", new Book("3", "One Piece", "Eiichiro Odda Sensei", 6));
		h.put("4", new Book("4", "Dragon Ball", "Akira Toriyama", 4));
		h.put("5", new Book("5", "Naruto", "Masashi Kishimoto", 8));
		h.put("6", new Book("6", "AOT", "Hajime Isayama", 3));
//		System.out.println(h);
		h.forEach((isbn, book) -> System.out.println("ISBN: " + isbn + " Book Details: " + book));

//		Allow the user to search for a book by ISBN and display its details.
		System.out.println("Enter ISBN id: ");
		String id = sc.nextLine();

		if (h.containsKey(id)) {
			h.forEach((isbn, book) -> {
				if (isbn.equals(id))
					System.out.println(" ISBN: " + isbn + " Book Details: " + book);
			});
		} else {
			System.out.println("Not a valid Id");
		}
		
//		Display all books in sorted order by title using a TreeSet. (5 Marks)
		TreeSet<String> t = h.values().stream().map(book -> book.getTitle()).collect(Collectors.toCollection(TreeSet::new));
		t.stream().sorted().forEach(System.out::println);
		
		// below code is not a valid
		Queue<String> waiting = new LinkedList<String>();
		System.out.println("Enter user name: ");
		String name =sc.nextLine();
		System.out.println("Enter Book Id and Copies that you want to borrow: ");
		String bid=sc.nextLine();
		System.out.println("Enter count of borrow: ");
		int c = sc.nextInt();
		Book book = h.get(bid);
		if(book != null)
		{
			if(book.getCopies()>0)
			{
				int dec = book.getCopies() - c;
				book.setCopies(dec);
				System.out.println(name+" Borrowed "+book.getTitle()+" copies "+c);
			}
			else
			{
				waiting.add(name);
				System.out.println("No copies are there "+name+" is added to waiting list");
			}
		}
		else
		{
			System.out.println("book not found in library");
		}
		
		waiting.stream().forEach(System.out::println);
		
	}

}
