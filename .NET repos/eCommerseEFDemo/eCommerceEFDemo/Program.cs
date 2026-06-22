using eCommerceEFDemo.Dal;
using eCommerceEFDemo.Models;
using Microsoft.EntityFrameworkCore;

namespace eCommerceEFDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("EF Core CRUD Operations!");
            eCommerceDBCon dBCon = new eCommerceDBCon();
            //var categories = from cat in dBCon.Categories select cat;
            //foreach (var category in categories)
            //{
            //    Console.WriteLine($"Category {category.CategoryName} and its description is {category.Description}!");
            //}
            //dBCon.Categories.Add(new Models.Category()
            //{
            //    CategoryName = "Sports School Shoes",
            //    Description = "All Kids Sports Shoes!"
            //});
            //dBCon.SaveChanges();

            //for deletion of data
            //dBCon.Categories.ExecuteDelete();
            //dBCon.SaveChanges();
            //------------------------------------------------------------------------------------------------------------------------
            //added category in the db

            //var category = new Models.Category()
            //{
            //    CategoryName = "Electronics",
            //    Description = "Electronic Products"
            //};
            //dBCon.Categories.Add(category);
            //dBCon.SaveChanges();
            //Console.WriteLine("Category Data Added");

            ////added products int the db
            //var laptop = new Models.Product()
            //{
            //    ProductName = "Laptop",
            //    ProductDescription = "Lenovo Legion 5",
            //    UnitPrice = 62000,
            //    Stock = 40,
            //    CategoryId = category.CategoryId
            //};
            //dBCon.Products.Add(laptop);

            //var mouse = new Models.Product()
            //{
            //    ProductName = "Mouse",
            //    ProductDescription = "Razer Mouse",
            //    UnitPrice = 500,
            //    Stock = 40,
            //    CategoryId = category.CategoryId
            //};

            //dBCon.Products.Add(laptop);
            //Console.WriteLine("Product1 Data Added");
            //dBCon.Products.Add(mouse);
            //Console.WriteLine("Product2 Data Added");
            //dBCon.SaveChanges();

            //// added customer data in db
            //var customer = new Models.Customer()
            //{
            //    ContactName = "Saiagar",
            //    City = "Pune",

            //};

            //dBCon.Customers.Add(customer);
            //dBCon.SaveChanges();
            //Console.WriteLine("Customer Data Added");

            ////added cart in db
            //var cart = new Models.Cart()
            //{
            //    CustomerId = customer.CustomerId
            //};

            //dBCon.Carts.Add(cart);
            //dBCon.SaveChanges();
            //Console.WriteLine("Cart Data Added");

            ////added cartItems in db
            //var cartItem1 = new Models.CartItem()
            //{
            //    CartId = cart.CartId,
            //    ProductId = laptop.ProductId,
            //    Quantity = 1,
            //    UnitPrice = laptop.UnitPrice
            //};

            //var cartItem2 = new Models.CartItem()
            //{
            //    CartId = cart.CartId,
            //    ProductId = mouse.ProductId,
            //    Quantity = 2,
            //    UnitPrice = mouse.UnitPrice
            //};

            //dBCon.CartItems.Add(cartItem1);
            //Console.WriteLine("CartItem1 Data Added");
            //dBCon.CartItems.Add(cartItem2);
            //Console.WriteLine("CartItem2 Data Added");
            //dBCon.SaveChanges();

            //decimal tAmount = (cartItem1.Quantity * cartItem1.UnitPrice) + (cartItem2.Quantity * cartItem2.UnitPrice);

            ////added invoice data in db
            //var invoice = new Models.Invoice()
            //{
            //    CartId = cart.CartId,
            //    InvoiceDate = DateTime.Now,
            //    TotalAmount = tAmount
            //};

            //dBCon.Invoices.Add(invoice);
            //dBCon.SaveChanges();
            //Console.WriteLine("Invoice Data Added");

            //Console.WriteLine("Invoice Created / Saved in the database");

            int custmorId = 1;
            int cartId = 1;

            var incoiceItems = from cust in dBCon.Customers
                               join cart in dBCon.Carts
                                on cust.CustomerId equals cart.CustomerId
                               join cartI in dBCon.CartItems
                                on cart.CartId equals cartI.CartId
                               join prod in dBCon.Products
                                on cartI.ProductId equals prod.ProductId
                               where cust.CustomerId == custmorId && cart.CartId == cartId
                               select new
                               {
                                   CustomerName = cust.ContactName,
                                   Product_Name = prod.ProductName,
                                   cartI.Quantity,
                                   cartI.UnitPrice,
                                   Amount = cartI.Quantity * cartI.UnitPrice
                               };
            Console.WriteLine($"Customer Id : {custmorId}");
            Console.WriteLine($"Cart Id : {cartId}");

            decimal total = 0;

            foreach (var item in incoiceItems)
            {
                Console.WriteLine($"Customer Name: {item.CustomerName} " +
                    $"{item.Product_Name} " +
                    $"Qty: {item.Quantity} " +
                    $"Price: {item.UnitPrice} " +
                    $"Amount: {item.Amount}");

                total += item.Amount;
            }

            Console.WriteLine("--------------------------------");
            Console.WriteLine($"Total Amount : {total}");

        }
    }
}
