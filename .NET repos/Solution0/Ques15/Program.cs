namespace Ques15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //15)	Write a program to display ASCII characters in the range(0 - 255). Pause after displaying every 10 characters.
            try
            {
                int count = 0;
                for (int i = 0; i < 256; i++)
                {
                    count++;
                    if (count == 10)
                    {
                        Console.ReadLine();
                        count = 0;
                    }
                    Console.WriteLine(Convert.ToChar(i));
                }
            }
            catch (Exception e)
            {

                Console.WriteLine(e.Message);
            }
        }
    }
}
