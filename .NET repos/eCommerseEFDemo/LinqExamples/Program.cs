using System.Threading.Channels;
using System.Xml.Linq;

namespace LinqExamples
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("LINQ Examples!");
            //var Customers=from customer in GetAllCustomers()
            //              where customer.City.Contains("i")
            //              select customer;
            //var Customers = from customer in GetAllCustomers()
            //                orderby customer.City, customer.ContactName descending
            //                select customer;
            //foreach (var cust in Customers)
            //{
            //    Console.WriteLine($"Customer Id {cust.CustomerId}, Name {cust.ContactName} lives in city {cust.City}!");
            //}
            //Join Query

            var CustomersOrders = from customer in GetAllCustomers()
                                 join
                                 order in GetAllOrders()
                                 on customer.CustomerId equals order.CustomerId
                                 join
                                 product in GetAllProducts()
                                 on order.ProductId equals product.ProductID
                                 select new { CustomerName=customer.ContactName, LivingCity=customer.City, Qty=order.Quantity, ODate=order.OrderDate, ProductName=product.ProductName, TotalAmount=order.Quantity * product.UnitPrice };
            foreach (var co in CustomersOrders)
            {
                Console.WriteLine($"{co.CustomerName} who lives in city {co.LivingCity} has placed order on {co.ODate} with quantity {co.Qty} for Product {co.ProductName} and total payable amount is {co.TotalAmount}!");
            }

        }
        private static List<Customer> GetAllCustomers()
        {
            return new List<Customer>()
        {
            new Customer() { CustomerId = 1, ContactName="John Mark", City="London" },
            new Customer() { CustomerId = 2, ContactName="Alicia Mark", City="London" },
            new Customer() { CustomerId = 3, ContactName="Alisha C.", City="Mumbai" },
            new Customer() { CustomerId = 4, ContactName="Manish Sharma", City="Delhi" },
            new Customer() { CustomerId = 5, ContactName="Manish Kaushik", City="Delhi" },
        };
        }
        private static List<Order> GetAllOrders()
        {
            return new List<Order>
            {
                new Order(){OrderId=100,Quantity=10,OrderDate=DateTime.Now,CustomerId=1 ,ProductId=1223},
                new Order(){OrderId=101,Quantity=20,OrderDate=DateTime.Now,CustomerId=1,ProductId=1224},
                new Order(){OrderId=103,Quantity=33,OrderDate=DateTime.Now,CustomerId=4,ProductId=1223},
                new Order(){OrderId=104,Quantity=13,OrderDate=DateTime.Now,CustomerId=5,ProductId=1225},
            };
        }
        private static List<Product> GetAllProducts()
        {
            var products = from product in XElement.Load(@"C:\Dotnet-June-2026\C#\CollectionsExamples\LinqExamples\Products.xml").Elements()
                           select new Product
                           {
                               ProductID=int.Parse(product.Attribute("ProductId").Value),
                               ProductName=product.Attribute("ProductName").Value,
                               UnitPrice=decimal.Parse(product.Attribute("UnitPrice").Value),
                               Stock=int.Parse(product.Attribute("Stock").Value)
                           };
            return products.ToList();
        }
    }
}
