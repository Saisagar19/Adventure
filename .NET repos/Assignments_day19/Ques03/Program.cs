using Ques3;

namespace Ques03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Stack<Book> book = new Stack<Book>();
            book.Push(new Book() { bookId = 1, title = ".NET Core" });
            book.Push(new Book() { bookId = 2, title = "Python Programming" });
            book.Push(new Book() { bookId = 3, title = "Java Programming" });
            book.Push(new Book() { bookId = 4, title = "Agentic Ai" });

            foreach (var item in book)
            {
                Console.WriteLine($"BookID {item.bookId} Title {item.title}");
            }
        }
    }
}
