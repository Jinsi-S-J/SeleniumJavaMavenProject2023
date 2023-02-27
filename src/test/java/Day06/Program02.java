package Day06;

import org.testng.annotations.Test;

public class Program02 //grouping of test cases

{
	@Test(groups= "smoke")
	public void testCase01()
	{
		System.out.println("Test Case2");
	}
	
	@Test
	public void testCase02()
	{
		System.out.println("Test Case2");
	}
	
	@Test(groups= "smoke")
	public void testCase03()
	{
		System.out.println("Test Case3");
	}
	
	@Test(groups= "smoke")
	public void testCase041()
	{
		System.out.println("Test Case4");
	}
	@Test
	public void testCase05()
	{
		System.out.println("Test Case5");
	}
}
