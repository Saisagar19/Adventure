using EComSite.Models;
using EComSite.Repositories;
using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;

namespace EComSite.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;
        private readonly ICommonRepo<Product> _productRepo; 

        public HomeController(ILogger<HomeController> logger, ICommonRepo<Product> _productR)
        {
            _logger = logger;
            _productRepo = _productR;
        }

        public async Task<IActionResult> Index()
        {
            var products = await _productRepo.GetAllAsync();
            ViewData["PageTitle"] = "Welcome To Products List!";
            return View(products);
        }


        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
