using System.ComponentModel.DataAnnotations;

namespace eCommerceEFDemo.Models;

public class CartItem
{
    [Key]//PK
    public int CartItemId { get; set; }

    //FK
    public int CartId { get; set; }

    //FK
    public int ProductId { get; set; }

    public int Quantity { get; set; }

    public decimal UnitPrice { get; set; }

    public Cart? Cart { get; set; }

    public Product? Product { get; set; }
}
