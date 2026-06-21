using eCommerceEFDemo.Dal;

namespace eCommerceEFDemo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("EF Core CRUD Operations!");
            eCommerceDBCon dBCon = new eCommerceDBCon();
            var categories = from cat in dBCon.Categories select cat;
            foreach (var category in categories)
            {
                Console.WriteLine($"Category {category.CategoryName} and its description is {category.Description}!");
            }
            //dBCon.Categories.Add(new Models.Category()
            //{
            //    CategoryName = "Sports School Shoes",
            //    Description = "All Kids Sports Shoes!"
            //});
            //dBCon.SaveChanges();


        }
    }
}
