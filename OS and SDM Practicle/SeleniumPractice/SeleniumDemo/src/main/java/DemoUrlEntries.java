import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoUrlEntries {
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
//		driver.close();
	}

}
