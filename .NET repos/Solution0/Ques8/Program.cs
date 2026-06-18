namespace Ques8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //8)Write a program to find LEAP year by using – 
            //a.If – Else and logical operators.
            //b.Conditional operator.
            //c.Note – A Leap year is divisible by 4 and is not divisible by 100 but it could be divisible by 400.

            //try
            //{
            //    Console.WriteLine("Enter Year: ");
            //    int year = Convert.ToInt32(Console.ReadLine());

            //    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            //    {
            //        Console.WriteLine($"{year} Year is a leap year ");
            //    }
            //    else
            //    {
            //        Console.WriteLine($"{year} Year is not a leap year ");
            //    }
            //}
            //catch (FormatException e)
            //{
            //    Console.WriteLine(e.Message);
            //}

            //catch (Exception e)
            //{
            //    Console.WriteLine(e.Message);
            //}

            try
            {
                Console.WriteLine("Enter Year: ");
                int year = Convert.ToInt32(Console.ReadLine());

                string res = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? $"{year} Year is a leap year " : $"{year} Year is not a leap year ";
                Console.WriteLine(res);

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
