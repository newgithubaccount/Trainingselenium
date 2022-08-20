package testing.com.SeleniumJava;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo extends BaseTest{
	@Test
	public void actionsdem()
	{
		Actions actions=new Actions(driver);
		actions.moveToElement(null).build().perform();
		actions.contextClick(null).build().perform();
		actions.dragAndDrop(null, null).build().perform();
	}

}
