namespace Ques20
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //20)	Write a function to print Fibonacci series for the number of terms entered by the user.
            int num = 0;
            try
            {
                do
                {
                    Console.WriteLine("Enter a positive number term: ");
                    num = Convert.ToInt32(Console.ReadLine());
                }while (num <= 0);
                fibonacci(num);
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
        static void fibonacci(int num)
        {
            int term0 = 0;
            int term1 = 1;

            Console.Write($"{term0} {term1}");
            for (int i = 3; i <= num; i++)
            {

                int nth = term0 + term1;
                term0 = term1;
                term1 = nth;
                Console.Write($" {nth}");
            }
        }
    }
}
