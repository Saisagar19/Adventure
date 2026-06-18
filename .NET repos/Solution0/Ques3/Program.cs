namespace Ques3
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int m1, m2, m3, m4, m5;
            Console.WriteLine("Enter Student Name: ");
            string? name = Console.ReadLine();
            try
            {
                Console.WriteLine("Enter Sub 1 Marks: ");
                m1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Sub 2 Marks: ");
                m2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Sub 3 Marks: ");
                m3 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Sub 4 Marks: ");
                m4 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Sub 5 Marks: ");
                m5 = Convert.ToInt32(Console.ReadLine());
                int sum = m1 + m2 + m3 + m4 + m5;
                Console.WriteLine($"Name of Student {name} Sum of Marks {sum}");
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
