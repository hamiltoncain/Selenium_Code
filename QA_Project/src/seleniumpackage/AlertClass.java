package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	        browserObject.get("https://training.qaonlinetraining.com/testPage.php");
	        browserObject.manage().window().maximize();
	        browserObject.findElement(By.id("alert")).click();
	        Alert apple = browserObject.switchTo().alert();
	        apple.accept();
	        browserObject.findElement(By.id("confirm")).click();
	        Alert orange = browserObject.switchTo().alert();
	        orange.dismiss();
	        browserObject.findElement(By.id("prompt")).click();
	        Alert button = browserObject.switchTo().alert();
	        button.sendKeys("Hamilton");
	        button.accept();
	}

}
