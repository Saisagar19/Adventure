namespace Ques5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int a = 20;
            int b = 10;
            Console.WriteLine($"Before Swap: a  = {a} , b  = {b}");
            int temp = a;
            a = b;
            b = temp;
            Console.WriteLine($"After Swap: a  = {a} , b  = {b}");
        }
    }
}
