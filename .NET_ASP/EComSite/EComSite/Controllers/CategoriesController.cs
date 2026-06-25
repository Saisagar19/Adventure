using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class CategoriesController : Controller
    {
        public IActionResult Index()
        {
            return View();
        }
    }
}
