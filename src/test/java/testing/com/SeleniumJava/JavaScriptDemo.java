package testing.com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptDemo extends BaseTest{
	

	@Test
	public void identifications()
	{
		WebElement user=driver.findElement(By.id("email"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='dummyd411@gmail.com'", user);
		WebElement login=driver.findElement(By.name("login"));
		jse.executeScript("arguments[0].click();", login);
		//jse.executeScript("arguments[0].scrollintoview();", login);
		driver.get("https://hdfc.com");
		sleep();
		sleep();
		WebElement home=driver.findElement(By.xpath("//a[@href='/housing-loans/home-loans']"));
		jse.executeScript("arguments[0].scrollIntoView();", home);
		jse.executeScript("arguments[0].click();", home);
		sleep();
	}

}
