using FirstDemoWebAPI.Model;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace FirstDemoWebAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class CustomersController : ControllerBase
    {
        private readonly List<Customer> _customer;

        public CustomersController()
        {
            _customer = new List<Customer>()
            {
                new Customer(){ CustomerId = 101, CustomerName="Aakash", City = "Pune"},
                new Customer(){ CustomerId = 102, CustomerName="Rohit", City = "Latur"},
                new Customer(){ CustomerId = 103, CustomerName="Vaibhav", City = "Nashik"},
                new Customer(){ CustomerId = 104, CustomerName="Santosh", City = "Kanpur"}
            };
        } 


        [ProducesResponseType(StatusCodes.Status200OK)]
        [ProducesResponseType(StatusCodes.Status204NoContent)]
        [HttpGet]
        public ActionResult<List<Customer>> Get()
        {
            if (_customer.Count > 0)
            {

                return Ok(_customer);
            }
            else
            {
                return NoContent();
            }
        }
    }

    ////api/Customers
    //[HttpGet]
    //public IEnumerable<Customer> Get()
    //{
    //    return _customer;
    //}

    ////api/Customers/101
    //[HttpGet("{id:int}")]\
    //public Customer Get(int id)
    //{
    //    return _customer.Find(c => c.CustomerId == id);
    //}

    //[HttpGet("CityWise/{city:alpha:minlength(3)}")]
    //public Customer Get(string city)
    //{
    //    return _customer.Find(c => c.City == city);
    //}
}

