namespace Ques22
{
    internal class Program
    {

        static int day;
        static int month;
        static int year;

        static void setDate(int d, int m, int y)
        {
            day = d;
            month = m;
            year = y;
        }
        static string getDate()
        {
            return day + "/" + month + "/" + year;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Enter day: ");
            day = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter month: ");
            month = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter year: ");
            year = Convert.ToInt32(Console.ReadLine());
            setDate(day, month, year);
            string res = getDate();
            Console.WriteLine(res);
        }


    }
}
