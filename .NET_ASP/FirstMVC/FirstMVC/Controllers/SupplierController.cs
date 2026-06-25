using FirstMVC.Models;
using Microsoft.AspNetCore.Mvc;

namespace FirstMVC.Controllers
{
    public class SupplierController : Controller
    {
        private readonly List<Supplier> _suppliers;

        public SupplierController()
        {
            _suppliers = new List<Supplier>() { 
            new Supplier(){SupplierID=1,SupplierName="A",ProductID=1220,Product="Laptop",
            ProductQuantity=100,UnitPrice=78000},
            new Supplier(){SupplierID=2,SupplierName="B",ProductID=1210,Product="Laptop",
            ProductQuantity=40,UnitPrice=30000},
            new Supplier(){SupplierID=1,SupplierName="A",ProductID=1234,Product="Table",
            ProductQuantity=30,UnitPrice=3000},
            new Supplier(){SupplierID=3,SupplierName="C",ProductID=1230,Product="Phone",
            ProductQuantity=80,UnitPrice=32000},

            };
        }

        public IActionResult Index()
        {
            return View();
        }
        public IActionResult Card()
        {
            return View(_suppliers);
        }

    }
}
