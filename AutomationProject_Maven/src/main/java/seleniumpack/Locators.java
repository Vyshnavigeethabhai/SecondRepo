package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Baseclass {
public void idLocator() {
	//WebElement elementname=driver.findElement(By.Locatorname("attributename");
	WebElement inputForm=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
	WebElement messageField=driver.findElement(By.id("single-input-field"));
WebElement	homeLogo=driver.findElement(By.className("top-logo"));
WebElement sideMenu=driver.findElement(By.linkText("Checkbox Demo"));


}
	public static void main(String[] args) {
		
		 Locators locate=new  Locators();
		 locate.initializeBrowser();
		 locate.idLocator();
	}

}
