namespace JsonUser
{
    internal class Program
    {
        static void Main(string[] args)
        {
            User user = new User();
            Address a = new Address();
            Geo g = new Geo();
            Company c = new Company();
            user.id = 1;
            user.name = "Alice";
            user.username = "alice142";
            user.email = "alice@gmail.com";
            user.phone = "1-770-736-8031 x56442";
            user.website = "hildegard.org";
            user.address = a;
            user.address.street = "Kulas Light";
            user.address.suit = "Apt. 556";
            user.address.city = "Gwenborough";
            user.address.zipcode = "92998-3874";
            user.address.geo = g;
            user.address.geo.lat = "-37.3159";
            user.address.geo.lag = "81.1496";
            user.company = c;
            user.company.name = "Romaguera-Crona";
            user.company.catchPhrase = "Multi-layered client-server neural-net";
            user.company.bs = "harness real-time e-markets";

            Console.WriteLine(user.id);
            Console.WriteLine(user.name);
            Console.WriteLine(user.username);
            Console.WriteLine(user.email);
            Console.WriteLine(user.phone);
            Console.WriteLine(user.website);
            Console.WriteLine(user.address.street);
            Console.WriteLine(user.address.suit);
            Console.WriteLine(user.address.suit);
            Console.WriteLine(user.address.city);
            Console.WriteLine(user.address.zipcode);
            Console.WriteLine(user.address.geo.lat);
            Console.WriteLine(user.address.geo.lag);
            Console.WriteLine(user.company.name);
            Console.WriteLine(user.company.catchPhrase);
            Console.WriteLine(user.company.bs);





        }
    }
}
