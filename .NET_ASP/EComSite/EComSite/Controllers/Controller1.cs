using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class Controller1 : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
