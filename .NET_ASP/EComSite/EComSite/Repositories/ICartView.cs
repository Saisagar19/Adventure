using EComSite.Models;

namespace EComSite.Repositories;

public interface ICartView
{
    Task<List<YourCartVM>> GetYourCartAsync(int cartId);
}
