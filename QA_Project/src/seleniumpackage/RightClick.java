package seleniumpackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	        Actions ball = new Actions(browserObject);
	        
	        WebElement right= browserObject.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
	        ball.contextClick(right).build().perform();
	}

}
