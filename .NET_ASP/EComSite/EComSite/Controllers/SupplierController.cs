using EComSite.Dal;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace EComSite.Controllers
{
    public class SupplierController : Controller
    {
        private readonly eCommerceDbContext _context;

        public SupplierController(eCommerceDbContext context)
        {
            _context = context;
        }
        public async Task<IActionResult> Index()
        {
            var suppliersList = await _context.Suppliers
                                              .Include(s => s.product)
                                              .ToListAsync();
            return View();
        }
    }
}
