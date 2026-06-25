using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class CustomerController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
