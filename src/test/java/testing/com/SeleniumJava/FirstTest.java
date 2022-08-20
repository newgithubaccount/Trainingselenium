package testing.com.SeleniumJava;

import org.testng.annotations.Test;

public class FirstTest {
	
	@Test(priority=1)
	public void firstTest()
	{
		System.out.println("This is my first Test");
	}
	@Test(priority=0,groups={"demo"})
	public void secondTest()
	{
		System.out.println("This is my second method");
	}

}
