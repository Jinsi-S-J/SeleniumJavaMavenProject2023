package Day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Program02 {

	public static void main(String[] args) throws IOException 
	{
		try {
			File src= new File(".\\src\\test\\resources\\config2.properties");
			OutputStream ip= new FileOutputStream(src);
			Properties property = new Properties();
			
			property.setProperty("browser", "Edge");
			property.setProperty("screenshot", "./src/test/");
			
			property.store(ip, "New Property added and updated browser");
			System.out.println(property);
			
		} 
		
		
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
