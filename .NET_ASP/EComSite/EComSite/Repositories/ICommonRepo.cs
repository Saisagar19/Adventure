namespace EComSite.Repositories;

public interface ICommonRepo<T>
{
    Task<List<T>> GetAllAsync();
    Task<T?> GetDeatilsAsync(int id);
    Task<int> InsertAsync(T item);
    Task<int> UpdateAsync(T item);
    Task<int> DeleteAsync(int id);


}
