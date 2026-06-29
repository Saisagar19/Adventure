using EComSite.Models;
using EComSite.Repositories;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;

namespace EComSite.Controllers;

public class CartsController : Controller
{
    private readonly ICommonRepo<Cart> _cartRepo;
    private readonly ICommonRepo<CartItem> _cartItemRepo;
    private readonly ICartView _cartView;

    public CartsController(ICommonRepo<Cart> cartRepo, ICommonRepo<CartItem> cartItemRepo, ICartView cartView)
    {
        _cartRepo = cartRepo;
        _cartItemRepo = cartItemRepo;
        _cartView = cartView;
    }

    public IActionResult Index()
    {
        return View();
    }

    public async Task<IActionResult> AddToCart(int productId)
    {
        if (HttpContext.Session.GetInt32("CartId") == null)
        {
            Cart cart = new Cart() { CustomerId = HttpContext.Session.GetInt32("CustomerId"), CartDate = DateTime.Now };
            int result = await _cartRepo.InsertAsync(cart);
            if (result > 0)
            {
                HttpContext.Session.SetInt32("CartId", cart.CartId);
            }
        }
        CartItem cartItem = new CartItem()
        {
            CartId = Convert.ToInt32(HttpContext.Session.GetInt32("CartId")),
            ProductId = productId,
            Quantity = 1
        };
        var cartItemResult = await _cartItemRepo.InsertAsync(cartItem);
        if (cartItemResult > 0)
        {
            return RedirectToAction("YourCart");
        }
        return View();
    }
    public async Task<IActionResult> YourCart()
    {
        var cartItems = await _cartView.GetYourCartAsync(Convert.ToInt32(HttpContext.Session.GetInt32("CartId")));
        return View("YourCart", cartItems);
    }
}

