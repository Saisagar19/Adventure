namespace Ques6
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //6)	Accept a character from a user and print its ASCII value using Console Application.
            try
            {
                Console.Write("Enter a Character: ");
                char ch = Convert.ToChar(Console.Read());
                int asciiValue = Convert.ToInt32(ch);
                Console.WriteLine($"ASCII Value of {ch} Character is {asciiValue}");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
