using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class CustomersController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
