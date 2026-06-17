namespace Ques9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter Basic Salary: ");
                double bs = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Enter Total Sales Amount: ");
                double totalSales = Convert.ToDouble(Console.ReadLine());

                double commission = 0.00;
                if (totalSales >= 5000.00 && totalSales <= 7500.00)
                {
                    commission = 3 / 100.00 * totalSales;
                }
                else if (totalSales >= 7501.00 && totalSales <= 10500.00)
                {
                    commission = 8 / 100.00 * totalSales;
                }
                else if (totalSales >= 10501.00 && totalSales <= 15000.00)
                {
                    commission = 11 / 100.00 * totalSales;
                }
                else
                {
                    commission = 11 / 100.00 * totalSales;
                }
                double netSalary = commission + bs;
                Console.WriteLine($"Net Salary: {netSalary}");
                Console.WriteLine($"commission: {commission}");
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
