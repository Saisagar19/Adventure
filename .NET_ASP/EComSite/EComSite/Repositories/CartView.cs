using EComSite.Dal;
using EComSite.Models;
using Microsoft.EntityFrameworkCore;

namespace EComSite.Repositories;

public class CartView : ICartView
{
    private readonly eCommerceDbContext _context;

    public CartView(eCommerceDbContext _Db)
    {
        _context = _Db;
    }

    public async Task<List<YourCartVM>> GetYourCartAsync(int cartId)
    {
        var yourCart = from cart in _context.Carts
                       join cartItem in _context.CartItems on cart.CartId equals cartItem.CartId
                       join product in _context.Products on cartItem.ProductId equals product.ProductId
                       join cat in _context.Categories on product.CategoryId equals cat.CategoryId
                       where cart.CartId == cartId
                       select new YourCartVM
                       {
                           CartId = cart.CartId,
                           CartItemId = cartItem.CartItemId,
                           CartDate = cart.CartDate,
                           CategoryName = cat.CategoryName,
                           ProductName = product.ProductName,
                           UnitPrice = product.UnitPrice,
                           Discount = product.Discount,
                           Picture = product.Picture,
                           Quantity = cartItem.Quantity

                       };
        return await yourCart.ToListAsync();
    }
}
