using EComSite.Dal;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace EComSite.Controllers
{
    public class ShippersController : Controller
    {
        private readonly eCommerceDbContext _context;

        public ShippersController(eCommerceDbContext con)
        {
            _context = con;
        }

        public async Task<IActionResult> Index()
        {
            var shippersList = await _context.Shippers.ToListAsync();
            return View(shippersList);
        }
    }
}
