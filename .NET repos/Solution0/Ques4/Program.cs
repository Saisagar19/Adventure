namespace Ques4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                int num1 = 55;
                int num2 = 44;
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
