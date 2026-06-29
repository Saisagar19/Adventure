using ControllerToView.Models;
using Microsoft.AspNetCore.Mvc;

namespace ControllerToView.Controllers
{
    public class ProductController : Controller
    {
        public IActionResult Index()
        {
            //Strongly typed view i.e . passing a model to the view

            var product = new Product()
            {
                ProductId = 1,
                ProductName = "Laptop",
                Price = 69459,
                StockQuantity = 10
            };

            //ViewBag is a dynamic object that allows you to pass data from the controller to the view.
            //It is a property of the Controller class and can be used to store any type of data.
            //ViewBag is a dynamic object, which means that you can add properties to it at runtime.
            //The properties of the ViewBag object are created dynamically, and they do not need to be defined in advance.
            ViewBag.Message = "This is a message from the ViewBag.";

            //ViewData is a dictionary object that allows you to pass data from the controller to the view.
            ViewData["Company"] = "Edgerunner.Inc";

            //TempData is a dictionary object that allows you to pass data from one action method to another action method.
            TempData["Success"] = "This is a message from the TempData.";

            return View(product);
        }

        public IActionResult Save()
        {
            TempData["Success"] = "Product saved successfully!";
            return RedirectToAction("Success");
        }

        public IActionResult Success()
        { 
            return View();
        }
    }
}
