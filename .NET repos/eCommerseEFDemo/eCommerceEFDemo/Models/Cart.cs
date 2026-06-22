using System.ComponentModel.DataAnnotations;

namespace eCommerceEFDemo.Models;

public class Cart
{
    [Key]//PK
    public int CartId { get; set; }

    //FK
    public int CustomerId { get; set; }

    public Customer? Customer  { get; set; }

    //one cart many cartitem
    public ICollection<CartItem>? CartItems { get; set; }

    public Invoice? Invoice { get; set; }  


}
