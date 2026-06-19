namespace Ques4
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Queue<Employee> emp = new Queue<Employee>();

            emp.Enqueue(new Employee() { Id = 101, Age = 55, Name = "Akash", Salary = 89456.5D });
            emp.Enqueue(new Employee() { Id = 102, Age = 23, Name = "Rohan", Salary = 26369.5D });
            emp.Enqueue(new Employee() { Id = 103, Age = 43, Name = "Piyush", Salary = 54453.8D });
            emp.Enqueue(new Employee() { Id = 104, Age = 29, Name = "Kruti", Salary = 75458.6D });
            emp.Enqueue(new Employee() { Id = 105, Age = 32, Name = "Sakshi", Salary = 69548.6D });

            foreach (Employee e in emp)
            {
                Console.WriteLine($"Id {e.Id} Name {e.Name} Age {e.Age} Salary {e.Salary}");
            }
        }
    }
}
