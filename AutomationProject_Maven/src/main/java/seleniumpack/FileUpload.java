package seleniumpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public WebDriver driver;
	public void open() throws AWTException {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.id("pickfiles"));
		selectpdf.click();
		StringSelection select=new StringSelection("C:\\Users\\VAISHNAVI\\Downloads\\Encapsulation Assignment.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
	Robot robot=new Robot();
	robot.delay(50);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void sendKeyseg() {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		WebElement selectpdf=driver.findElement(By.id("pickfiles"));
		selectpdf.click();
		selectpdf.sendKeys("C:\\Users\\VAISHNAVI\\Downloads\\Encapsulation Assignment.pdf");
		
	}

	public static void main(String[] args) throws AWTException {
		FileUpload file=new FileUpload();
		//file.open();
file.sendKeyseg();
	}

}
