using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class InvoicesController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
