package assign7;

/*Q4. Online Shopping Cart (30 Marks)
	Write a Java program to simulate a shopping cart.
	Create a Product class with: int pid, String name, double price. (5 Marks)
	Maintain a Map<Integer, Product> as the product catalog. (5 Marks)
	Allow the user to add products to a Cart (List<Product>). (5 Marks)
	Display the contents of the cart with total price. (5 Marks)
	Remove a product from the cart by ID. (5 Marks)
	Maintain the last 3 actions (add/remove) in a Stack and display the undo history. (5 Marks)*/
public class Product {
	private int pid;
	private String name;
	private double price;

	public Product() {
	}

	public Product(int pid, String name, double price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

}
