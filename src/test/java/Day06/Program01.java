package Day06;

import org.testng.annotations.Test;

public class Program01 // Running a single test case multiple times
{

	@Test(invocationCount=10)
	public void testCase01()
	{
		System.out.println("Test Case");
	}
	
}
