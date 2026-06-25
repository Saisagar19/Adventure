using Microsoft.EntityFrameworkCore;
using EComSite.Models;

namespace EComSite.Dal;

public class eCommerceDbContext : DbContext
{
    public eCommerceDbContext()
    {
        
    }
    public eCommerceDbContext(DbContextOptions<eCommerceDbContext> options) : base(options)
    {
        
    }
    public DbSet<Product> Products { get; set; }
    public DbSet<Cart> Carts { get; set; }
    public DbSet<Customer> Customers { get; set; }
    public DbSet<Category> Categories { get; set; }
    public DbSet<CartItem> CartItems { get; set; }
    public DbSet<Invoice> Invoices { get; set; }
    public DbSet<Shipper> Shippers { get; set; }
    public DbSet<Supplier> Suppliers { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
    {
        if(!optionsBuilder.IsConfigured)
        {
            optionsBuilder.UseMySQL("Server=127.0.0.1;Port=1919;Database=eComDBDemo;User Id=root;Password=root;");
        }
    }
}
