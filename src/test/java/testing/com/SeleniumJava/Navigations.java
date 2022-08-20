package testing.com.SeleniumJava;

import org.testng.annotations.Test;

public class Navigations extends BaseTest{
	
	@Test
	public void launchBrowser() {
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getPageSource());
	}

	@Test
	public void navigationsDemo() {
		
		driver.navigate().to("https://google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
	}

}
