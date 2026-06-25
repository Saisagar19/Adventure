using System.ComponentModel.DataAnnotations;

namespace EComSite.Models;

public class Customer
{
    public int CustomerId { get; set; }
    [MaxLength(100)]
    [Required(ErrorMessage = "Contact Name is a required field!")]
    public string ContactName { get; set; } = string.Empty;
    [MaxLength(100)]
    [Required(ErrorMessage = "Address is a required field!")]
    public string Address { get; set; } = string.Empty;
    [MaxLength(100)]
    [Required(ErrorMessage = "City is a required field!")]
    public string City { get; set; } = string.Empty;
    //one customer can have many carts, so we will use ICollection<Cart> to represent the relationship between Customer and Cart.
    public ICollection<Cart>? Carts { get; set; }
}
