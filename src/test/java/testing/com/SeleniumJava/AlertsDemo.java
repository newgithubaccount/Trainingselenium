package testing.com.SeleniumJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AlertsDemo extends BaseTest{
	
	@Test
	public void handleAlert()
	{
		extentTest=extentReports.createTest("Alert Demo");
		driver.get("http://www.seleniumframework.com/Practiceform/");
		extentTest.info("Starting alert Test");
		driver.findElement(By.id("alert")).click();
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
	//	alert.dismiss();
	}
	
	@Test
	public void handlePages()
	{
		extentTest=extentReports.createTest("Alert Demo");
		driver.get("http://www.seleniumframework.com/Practiceform/");
		extentTest.info("Starting alert Test");
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Set<String> posth=driver.getWindowHandles();
		System.out.println(posth.size());
		 List<String> arr = new ArrayList<String>(posth);
		driver.switchTo().window(arr.get(1).toString());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		driver.navigate().refresh();
	}
	
	@Test
	public void iframeDemo()
	{
		driver.switchTo().frame("frame name");
		driver.findElement(By.id("")).click();
		driver.switchTo().defaultContent();
	}

	

}
