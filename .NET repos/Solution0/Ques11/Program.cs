namespace Ques11
{
    internal class Program
    {
        static void Main(string[] args)
        {

            //11)	Write a program to find maximum of 3 numbers using – 
            //    a.If – else.
            //    b.Conditional operators.



            try
            {
                Console.WriteLine("Enter 1 Number: ");
                int num1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter 2 Number: ");
                int num2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter 3 Number: ");
                int num3 = Convert.ToInt32(Console.ReadLine());

                if (num1 > num2 && num1 > num3)
                {
                    Console.WriteLine($"Greater Num is {num1}");
                }
                else if (num2 > num1 && num2 > num3)
                {
                    Console.WriteLine($"Greater Num is {num2}");
                }
                else
                {
                    Console.WriteLine($"Greater Num is {num3}");
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

            //try
            //{
            //    Console.WriteLine("Enter 1 Number: ");
            //    int num1 = Convert.ToInt32(Console.ReadLine());
            //    Console.WriteLine("Enter 2 Number: ");
            //    int num2 = Convert.ToInt32(Console.ReadLine());
            //    Console.WriteLine("Enter 3 Number: ");
            //    int num3 = Convert.ToInt32(Console.ReadLine());

            //    string res = (num1 > num2 && num1 > num3) ? $"Greater Num is {num1}" : (num2 > num1 && num2 > num3) ? $"Greater Num is {num2}" : $"Greater Num is {num3}";
            //    Console.WriteLine(res);

            //}
            //catch (FormatException e)
            //{
            //    Console.WriteLine(e.Message);
            //}
            //catch (Exception e)
            //{
            //    Console.WriteLine(e.Message);
            //}
        }
    }
}
