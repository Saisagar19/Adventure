import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//provide the path
		driver.get("https://www.google.com");
		//use the web locater
		driver.findElement(By.name("q")).sendKeys("Friends");
		//perform an action
		driver.findElement(By.name("btnK")).submit();
		driver.close();
		

	}

}
