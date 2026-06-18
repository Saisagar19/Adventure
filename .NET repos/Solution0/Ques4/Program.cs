namespace Ques4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter Num1: ");
                int num1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Num2: ");
                int num2 = Convert.ToInt32(Console.ReadLine());
                int sum = num1 + num2;
                Console.WriteLine($"Addition of Two Num: {sum}");
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
