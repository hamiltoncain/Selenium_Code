package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class. 
	        ChromeDriver browserObject = new ChromeDriver();
	        browserObject.get("https://www.google.com/");    
	        WebElement a=browserObject.findElement(By.linkText("Gmail"));
	        
	        if(a.isDisplayed())
	        {
	        	System.out.println("The Gmail element is displayedd");
	        }
	        else
	        {
	        	System.out.println("The Gmail element is not siplayed");
	        }
	}

}
