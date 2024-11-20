package seleniumpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_newTab {
public WebDriver driver;
public void openBrowser() throws AWTException {
	driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/merge_pdf");
	driver.manage().window().maximize();
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_T);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_T);
	

}

	public static void main(String[] args) throws AWTException {
		Robot_newTab tab=new Robot_newTab();
		tab.openBrowser();

	}

}
