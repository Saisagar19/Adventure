using eCommerceEFDemo.Models;
using Microsoft.EntityFrameworkCore;

namespace eCommerceEFDemo.Dal;

public class eCommerceDBCon : DbContext
{
    public eCommerceDBCon()
    {

    }
    public eCommerceDBCon(DbContextOptions<eCommerceDBCon> options) : base(options)
    {

    }
    public DbSet<Category> Categories { get; set; }
    public DbSet<Product> Products { get; set; }
    public DbSet<Customer> Customers { get; set; }
    public DbSet<Cart> Carts { get; set; }
    public DbSet<CartItem> CartItems { get; set; }
    public DbSet<Invoice> Invoices { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if (!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseMySQL("Server = 127.0.0.1; Port = 1919; Database = SampleECommerceDB; User Id = root; Password = root;");
        }
    }
}
