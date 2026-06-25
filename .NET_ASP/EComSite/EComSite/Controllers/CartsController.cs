using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class CartsController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
