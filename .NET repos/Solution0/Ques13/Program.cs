namespace Ques13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter a date in dd/mm/yy Format: ");
                string? dateD = Console.ReadLine();
                int month = Convert.ToInt32(dateD.Substring(3, 2));
                int year = Convert.ToInt32(dateD.Substring(6, 2));
                //Console.WriteLine(month);
                string[] monthArr = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December" };
                if (month <= monthArr.Length)
                {
                    Console.WriteLine($"Month : {monthArr[month - 1]}");
                }
                else
                {
                    Console.WriteLine("Enter a valid number for month in between 1 - 12");
                }
                if (month == 2)
                {
                    if (year % 4 == 0)
                    {
                        Console.WriteLine("Total number Of days: 29");
                    }
                    else
                    {
                        Console.WriteLine("Total number Of days: 28");
                    }
                }
                else if (month == 8)
                {
                    Console.WriteLine("Total number Of days: 31");
                }
                else if (month >= 1 && month <= 7)
                {
                    if ((month % 2 == 0 && month != 2))
                    {
                        Console.WriteLine("Total number Of days: 30");
                    }
                    else
                    {
                        Console.WriteLine("Total number Of days: 31");
                    }
                }
                else if (month >= 8 && month <= 12)
                {
                    if ((month % 2 == 0 && month != 2))
                    {
                        Console.WriteLine("Total number Of days: 31");
                    }
                    else
                    {
                        Console.WriteLine("Total number Of days: 30");
                    }
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
