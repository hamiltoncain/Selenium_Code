package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.name("name")).sendKeys("Hamilton");
	        browserObject.findElement(By.id("eml")).sendKeys("hamiltoncain23@gmail.com");
	        browserObject.findElement(By.name("website")).sendKeys("www.linkedin.com");
	        browserObject.findElement(By.name("comment")).sendKeys("N/A");
	        browserObject.findElement(By.xpath("//input[@value='female']")).click();
	        
	        Thread.sleep(6000);
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        
	        browserObject.findElement(By.name("bike")).click();
	        browserObject.findElement(By.name("boat")).click();
	        browserObject.findElement(By.name("horse")).click();
	        
	        WebElement cn=browserObject.findElement(By.name("country"));
	        Select obj= new Select(cn);
	        obj.selectByVisibleText("India");
	        
	        WebElement cn1=browserObject.findElement(By.name("skill"));
	        Select obj1= new Select(cn1);
	        obj1.selectByVisibleText("Programming");
	        obj1.selectByVisibleText("Database");
	        
	        
	        browserObject.findElement(By.name("submit")).click();

	}

}
