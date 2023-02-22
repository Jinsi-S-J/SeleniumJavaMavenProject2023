package Day04;

public class Program01 extends Framework {

	public static void main(String[] args)
	{
		reportStart("Feb22");
		testCaseStart("TestCase01", "Verify Value been entered in all fields");
		browser("Chrome");
		application("https://demo.automationtesting.in/Register.html");
		typeIn("//input[@placeholder='First Name']", "TestFN","Jinsi");
		typeIn("//input[@placeholder='Last Name']", "TestLN","S J");
		selectDropDownByValue("//select[@id='Skills']", "APIs","Skills");
		testCaseEnd();
		reportEnd();

	}

}
