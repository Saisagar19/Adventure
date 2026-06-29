using EComSite.Dal;
using EComSite.Models;
using EComSite.Repositories;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);
builder.Services.AddDistributedMemoryCache();
// Add services to the container.
builder.Services.AddControllersWithViews();
builder.Services.AddSession(config =>
{
    config.Cookie.IsEssential = true;
    config.Cookie.HttpOnly = true;
});
var eComDb = builder.Configuration.GetConnectionString("EComDbConStr");

builder.Services.AddDbContext<eCommerceDbContext>(options =>
{
    options.UseMySQL(eComDb);
});

builder.Services.AddScoped<ICommonRepo<Category>, CommonRepo<Category>>();
builder.Services.AddScoped<ICommonRepo<Product>, CommonRepo<Product>>();
builder.Services.AddScoped<ICommonRepo<Customer>, CommonRepo<Customer>>();
builder.Services.AddScoped<ICommonRepo<Cart>, CommonRepo<Cart>>();
builder.Services.AddScoped<ICommonRepo<CartItem>, CommonRepo<CartItem>>();
builder.Services.AddScoped<ICommonRepo<Invoice>, CommonRepo<Invoice>>();
builder.Services.AddScoped<ICartView, CartView>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();
app.UseSession();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}")
    .WithStaticAssets();


app.Run();
