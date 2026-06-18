namespace Ques2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Student Name: ");
            string? name = Console.ReadLine();

            Console.WriteLine("Enter 5 Sub Marks: ");
            //Console.WriteLine("Enter Sub 1 Marks: ");
            //int m1 = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Sub 2 Marks: ");
            //int m2 = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Sub 3 Marks: ");
            //int m3 = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Sub 4 Marks: ");
            //int m4 = Convert.ToInt32(Console.ReadLine());
            //Console.WriteLine("Enter Sub 5 Marks: ");
            //int m5 = Convert.ToInt32(Console.ReadLine());
            int sum = 0;
            for (int i = 0; i < 5; i++)
            {
                while (true)
                {
                    Console.WriteLine($"Enter Sub {i + 1} Marks: ");
                    try
                    {
                        int m = Convert.ToInt32(Console.ReadLine());
                        sum += m;
                        break;
                    }
                    catch (FormatException ex)
                    {
                        Console.WriteLine(ex.Message);
                        
                    }
                }
            }
            double avg = sum / 5;
            Console.WriteLine($"Name Of Student: {name} \n5 Subject Average Marks: {avg}");

        }
    }
}
