package testing.com.SeleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTables extends BaseTest{
	
	@Test
	public void webtablesDemo()
	{
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		List<WebElement> trs=driver.findElements(By.xpath("//table[contains(@class,'ws-table-all')]/tbody/tr"));
		for(WebElement tr:trs)
		{
			List<WebElement> tds=	tr.findElements(By.tagName("td"));
			for(WebElement td:tds)
				System.out.println(td.getText());
		}
	}

}
