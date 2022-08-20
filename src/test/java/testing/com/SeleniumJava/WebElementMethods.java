package testing.com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementMethods extends BaseTest{
	

	@Test
	public void identifications()
	{
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("dummyd411@gmail.com");
		sleep();
		driver.findElement(By.name("pass")).sendKeys("dummy@123");
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		sleep();
	}

}
