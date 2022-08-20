package testing.com.SeleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class Waits extends BaseTest{
	
	@Test
	public void waitsDemo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30000));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("month"))));
		WebElement month=driver.findElement(By.id("month"));
		
	}

}
