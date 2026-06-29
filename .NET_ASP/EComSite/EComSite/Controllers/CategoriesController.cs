using EComSite.Repositories;
using Microsoft.AspNetCore.Mvc;
using EComSite.Models;

namespace EComSite.Controllers
{
    public class CategoriesController : Controller
    {
        private readonly ICommonRepo<Category> _categoryRepo;

        public CategoriesController(ICommonRepo<Category> catRepo)
        {
            _categoryRepo = catRepo;
        }
        public async Task<IActionResult> Index()
        {
            ViewData["Title"] = "Categories Of Shoes";
            var categories = await _categoryRepo.GetAllAsync();
            return View(categories);
        }
    }
}
