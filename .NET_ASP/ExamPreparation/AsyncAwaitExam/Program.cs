namespace AsyncAwaitExam
{
    internal class Program
    {
        static async Task Main(string[] args)
        {
            Console.WriteLine("Conference Booking WorkFlow");
            var customers = await GetAllCustomersAsync();
            Console.WriteLine("");
            var FilterCust = await FilterCustomerAsync("Pune", customers);
            Console.WriteLine("");
            var flightCust = await FlightBookingAsync(FilterCust);
            Console.WriteLine("");
            var hotelCustomer = await HotelBookingAsync(FilterCust);

        }

        private async static Task<List<Customer>> GetAllCustomersAsync()
        {
            var allCustomers = new List<Customer>()
            {
                new Customer(){ CustomerId = 1, CustomerName="Rohit", City="Pune"},
                new Customer(){ CustomerId = 2, CustomerName="Rounak", City="Delhi"},
                new Customer(){ CustomerId = 3, CustomerName="Rakesh", City="Nanded"},
                new Customer(){ CustomerId = 4, CustomerName="Rohan", City="Pune"},
            };

            foreach (var item in allCustomers)
            {
                Console.WriteLine($"CustomerId: {item.CustomerId}  CustomerName: {item.CustomerName} City: {item.City}");
            }

            return await Task<List<Customer>>.Run(() => allCustomers);
        }

        private async static Task<List<Customer>> FilterCustomerAsync(string city, List<Customer> customers)
        {
            var NonPuneCustomers = Task<List<Customer>>.Run(() => customers.Where(c => c.City != city).ToList());
            foreach (var item in NonPuneCustomers.Result)
            {
                Console.WriteLine($"Customer {item.CustomerName} from {item.City} is coming from the city {item.City} for the conference!");
            }
            return await NonPuneCustomers;
        }

        private async static Task<List<Customer>> FlightBookingAsync(List<Customer> customers)
        {
            foreach (var item in customers)
            {
                Console.WriteLine($"Flight has been booked for {item.CustomerName} from {item.City} to Pune");
            }
            return await Task<List<Customer>>.Run(() => customers);
        }

        private async static Task<List<Customer>> HotelBookingAsync(List<Customer> customers)
        {
            foreach (var item in customers)
            {
                Console.WriteLine($"Hotel has been booked for {item.CustomerName}");
            }
            return await Task<List<Customer>>.Run(() => customers);
        }
    }
}
