using System.ComponentModel.DataAnnotations;

namespace EComSite.Models;

public class Category
{
    public int CategoryId { get; set; }
    [MaxLength(100)]
    [Required(ErrorMessage = "Category Name is a required field!")]
    public string CategoryName { get; set; } = string.Empty;
    [MaxLength(400)]
    [Required(ErrorMessage = "Category Description is a required field!")]
    public string CategoryDesc { get; set; } = string.Empty;
    //one category can have many products, so we will use ICollection<Product> to represent the relationship between Category and Product.
    public ICollection<Product>? Products { get; set; }

}
