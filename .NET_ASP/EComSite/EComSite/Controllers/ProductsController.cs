using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class ProductsController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
