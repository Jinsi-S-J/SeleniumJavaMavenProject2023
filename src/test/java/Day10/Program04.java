package Day10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program04 {

	public static void main(String[] args) {
	
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// deprecated in selenium
		

	}

}
