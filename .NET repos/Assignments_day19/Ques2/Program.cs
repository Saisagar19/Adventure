namespace Ques2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            List<Customer> customers = GetAllCustomers();

            List<Customer> londonCustomers = customers.FindAll(londonCust);

            foreach (Customer customer in londonCustomers)
            {
                Console.WriteLine($"{customer.CustomerId} {customer.Name} {customer.City}");
            }

        }
        static bool londonCust(Customer c)
        {
            return c.City == "London";
        }
        private static List<Customer> GetAllCustomers()
        {
            return new List<Customer>()
            {
                new Customer() { CustomerId = 1, Name="Peter Parker", City="London" },
                new Customer() { CustomerId = 2, Name="Tony Stark", City="London" },
                new Customer() { CustomerId = 3, Name="Natasha R.", City="Mumbai" },
                new Customer() { CustomerId = 4, Name="Bruce Banner", City="London" },
                new Customer() { CustomerId = 5, Name="Thor ", City="Asgard" },
            };
        }
    }
}
