import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebLocator {
	
	
	public static void main(String[] args) {
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
//		driver.quit(); it will the all the tabs are open to closed
//		driver.close(); it will close the single tab
	}

}
//driver.manage().maximize();
//SelectByVisibleText("Banana")
//SelectByIndex(3)

//for dropdown 
	//is visible text()
	//by index ()

// dragAndDropBy() is js method for resizing the the square to rectangle and perform an action