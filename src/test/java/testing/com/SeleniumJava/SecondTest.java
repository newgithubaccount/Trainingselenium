package testing.com.SeleniumJava;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test
	public void thirdTest()
	{
		System.out.println("This is my first Test");
	}
	@Test(groups={"demo1","demo2"})
	public void fourthTest()
	{
		System.out.println("This is my second method");
	}

}
