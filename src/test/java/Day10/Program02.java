package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program02 {

	public static void main(String[] args) {
		// Program to check if element is enabled in the page
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		WebElement fn = driver.findElement(By.name("firstName"));
		
		System.out.println(fn.isEnabled());// check if element is present
		
		if(fn.isEnabled())
		{
			fn.sendKeys("FirstName");
			
		}
		else
		{
			System.out.println("First Name is disabled");
		}


	}

}
