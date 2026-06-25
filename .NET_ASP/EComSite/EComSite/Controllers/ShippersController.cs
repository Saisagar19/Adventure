using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class ShippersController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
