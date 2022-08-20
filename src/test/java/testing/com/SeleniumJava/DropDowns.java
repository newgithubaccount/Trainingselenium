package testing.com.SeleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns extends BaseTest{
	
	@Test
	public void drops()
	{
		sleep();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		sleep();
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		select.selectByIndex(1);
		sleep();
		select.selectByValue("8");
		sleep();
		select.selectByVisibleText("Dec");
		sleep();
	}

}
