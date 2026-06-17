namespace Ques7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //7)	Write a program to calculate Net Salary of an employee using Basic Salary based on following parameters – 
            //a.HRA is 20 % of basic salary.
            //b.DA is 40 % of basic salary.
            //c.PF is 10 % of Gross salary.
            //d.Gross Salary is Basic Salary + HRA + DA.
            //e.Net salary is Gross Salary – PF.

            try
            {
                double hra, da, pf, gs, netSalary;
                Console.WriteLine("Enter Employee Name: ");
                string? name = Console.ReadLine();

                Console.WriteLine("Enter Basic Salary: ");
                double basicSalary = Convert.ToDouble(Console.ReadLine());

                hra = (20 / 100.00) * basicSalary;
                Console.WriteLine($"HRA {hra}");
                da = (40 / 100.00) * basicSalary;
                Console.WriteLine($"DA {da}");
                gs = hra + da + basicSalary;
                Console.WriteLine($"Gross Salary {gs}");
                pf = (10 / 100.00) * gs;
                Console.WriteLine($"PF {pf}");
                netSalary = gs - pf;
                Console.WriteLine($"Name of Employee {name} Net Salary {netSalary}");
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
