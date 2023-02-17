package Day02;

public class NewProject extends Framework {

	public static void main(String[] args) {
		
		browser("Chrome");
		application("https://demo.automationtesting.in/Register.html");
		typeIn("//input[@placeholder='First Name']", "Fname");
		typeIn("//input[@placeholder='Last Name']", "LName");
		selectDropDownByValue("//select[@id='Skills']", "APIs");
		clearAll("//input[@placeholder='First Name']");
		clickIn("//input[@value='Male']");
		clickIn("");

	}

}
