namespace Ques14
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //14)	Write a program to accept a number from user and find its absolute value. Absolute always returns a positive value.
            try
            {
                Console.WriteLine("Enter a Number: ");
                int num = Convert.ToInt32(Console.ReadLine());
                int res = (num < 0) ? -1 * (num) : num;
                Console.WriteLine($"Absolute value {res}");
            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }

        }
    }
}
