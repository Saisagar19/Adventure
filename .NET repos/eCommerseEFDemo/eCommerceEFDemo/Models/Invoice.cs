using System.ComponentModel.DataAnnotations;

namespace eCommerceEFDemo.Models;

public class Invoice
{
    [Key]//PK
    public int InvoiceId { get; set; }

    //Fk
    public int CartId { get; set; }

    public DateTime InvoiceDate { get; set; }

    public decimal TotalAmount { get; set; }

    public Cart? Cart { get; set; }

}
