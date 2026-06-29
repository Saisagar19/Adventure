using EComSite.Models;
using EComSite.Repositories;
using Microsoft.AspNetCore.Mvc;

namespace EComSite.Controllers
{
    public class ProductsController : Controller
    {
        private readonly ICommonRepo<Product> _productRepo;

        public ProductsController(ICommonRepo<Product> _productR)
        {
            _productRepo = _productR;
        }

        public async Task<IActionResult> Index()
        {
            var products = await _productRepo.GetAllAsync();
            ViewData["PageTitle"] = "Welcome To Products List!";
            return View(products);
        }

        public async Task<IActionResult> CatWiseProducts(int categoryId)
        {
            var products = await _productRepo.GetAllAsync();
            ViewData["PageTitle"] = "Welcome To Products List!";
            return View("Index", products.Where(p => p.CategoryId == categoryId));
        }

        public async Task<IActionResult> Details(int id)
        {
            var product = await _productRepo.GetDeatilsAsync(id);
            if (product == null)
            {
                return NotFound();
            }
            return View(product);
        }
    }
}
