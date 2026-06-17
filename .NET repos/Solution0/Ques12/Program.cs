namespace Ques12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter Employee Number: ");
                int eNum = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Department Number: ");
                int deptNum = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Enter Designation Code: ");
                char desCode = Convert.ToChar(Console.Read());

                if (deptNum == 10 && desCode == 'M')
                {
                    Console.WriteLine($"Employee No: {eNum} Department No: {deptNum} Department Name: Purchase Designation: Manager");
                }
                else if (deptNum == 20 && desCode == 'S')
                {
                    Console.WriteLine($"Employee No: {eNum} Department No: {deptNum} Department Name: Sales Designation: Supervisor");
                }
                else if (deptNum == 30 && desCode == 'A')
                {
                    Console.WriteLine($"Employee No: {eNum} Department No: {deptNum} Department Name: Production Designation: Analyst");
                }
                else if (deptNum == 40 && desCode == 's')
                {
                    Console.WriteLine($"Employee No: {eNum} Department No: {deptNum} Department Name: Marketing Designation: Sales Person");
                }
                else if (deptNum == 50 && desCode == 's')
                {
                    Console.WriteLine($"Employee No: {eNum} Department No: {deptNum} Department Name: Accounts Designation: Accountant");
                }
                else
                {
                    Console.WriteLine("Not a Valid Information");
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
