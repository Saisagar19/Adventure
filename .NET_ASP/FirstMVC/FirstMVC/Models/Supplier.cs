namespace FirstMVC.Models
{
    public class Supplier
    {
        public int SupplierID { get; set; }
        public string SupplierName{ get; set; }=string.Empty;
        public string Product { get; set; } = string.Empty;
        public int ProductID { get; set; }
           
        public int ProductQuantity { get; set; }
        public decimal UnitPrice { get; set; }

    }
}
