package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public WebDriver driver;
	public void initializeBrowser()
	{
		driver= new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}


	public static void main(String[] args) {
		Baseclass obj=new Baseclass();
		obj.initializeBrowser();
	

	}

}
