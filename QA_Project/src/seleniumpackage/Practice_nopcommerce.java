package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_nopcommerce {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class. 
		        ChromeDriver browserObject = new ChromeDriver();
			// 3. Open the https://admin-demo.nopcommerce.com/login link using get method.
		        browserObject.get("https://admin-demo.nopcommerce.com/login");
		        
		        WebElement email=browserObject.findElement(By.name("Email"));
		       email.clear();
		       email.sendKeys("admin@yourstore.com");
		       
		       WebElement pass=browserObject.findElement(By.name("Password"));
		       pass .clear();
		       pass.sendKeys("admin");
		        
		        browserObject.findElement(By.className("login-button")).click();
}
}
