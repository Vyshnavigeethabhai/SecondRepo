package seleniumpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
public WebDriver driver;
public void openBrowserSite() {
	driver=new ChromeDriver();
	driver.get("https://webdriveruniversity.com/");
	driver.manage().window().maximize();
	WebElement contact=driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
	contact.click();
	WebElement login=driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
	login.click();
	String parent=driver.getWindowHandle();
	String title=" ";
	//System.out.println("parent window"+(parent));
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println("Child window"+ allWindows);
	for(String temp:allWindows) {
		if(!temp.equals(parent));{
			System.out.println("Except parent"+temp);
			driver.switchTo().window(temp);
			//System.out.println(driver.getTitle());
			title=driver.getTitle();
		}
		if(title.equals("WebDriver | LoginPortal"))
		{
			WebElement 	username=driver.findElement(By.xpath("//*[@id=\"text\"]"));
			username.click();
			username.sendKeys("Vyshnavi");
		}
		if(title.equals("WebDriver | Contact us"))
		{
			WebElement firstName=driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
			firstName.click();
			firstName.sendKeys("Geetha");
		}
	}
}
	public static void main(String[] args) {
		MultipleWindowHandling handling=new MultipleWindowHandling();
		handling.openBrowserSite();

	}

}
