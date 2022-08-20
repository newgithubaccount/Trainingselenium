package testing.com.SeleniumJava;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class FileUpload extends BaseTest{
	
	@Test
	public void demo() throws AWTException, InterruptedException
	{
		 Robot r = new Robot();
	       String filepath = "C:/Users/swapna/Pictures/lalan-maths-work-tables.png";
	       StringSelection stringSelection = new StringSelection(filepath);
	       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	       clipboard.setContents(stringSelection, stringSelection);
	        
	       r.keyPress(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_V);
	       r.keyRelease(KeyEvent.VK_V);
	       r.keyRelease(KeyEvent.VK_CONTROL);
	       r.keyPress(KeyEvent.VK_ENTER);
	       r.keyRelease(KeyEvent.VK_ENTER);
	        
	       Thread.sleep(1000);
	}

}
