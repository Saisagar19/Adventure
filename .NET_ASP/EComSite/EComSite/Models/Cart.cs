namespace EComSite.Models;

public class Cart
{
    public int CartId { get; set; }
    public DateTime CartDate { get; set; }
    public int? CustomerId { get; set; }
   //one cart can have many cart items, so we will use ICollection < CartItem > to represent the relationship between Cart and CartItem.
    public ICollection<CartItem>? CartItems { get; set; }
    public Invoice? Invoice { get; set; }
}
