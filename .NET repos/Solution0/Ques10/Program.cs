namespace Ques10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //10)	Using a switch case write a menu driven program to perform basic calculations of two user entered numbers.

            try
            {
                Console.WriteLine("Enter number 1: ");
                int num1 = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter number 2: ");
                int num2 = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Press Below index: \n1.ADD");
                char ind = Convert.ToChar(Console.Read());

                switch (ind)
                {
                    case '1':
                        int sum = num1 + num2;
                        Console.WriteLine($"Sum : {sum}");
                        break;
                    default:
                        Console.WriteLine("Invalid input");
                        break;

                }
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
