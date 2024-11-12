package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_class extends Baseclass{

	public void dropdwonBox() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement selectDropdown=driver.findElement(By.id("single-input-field"));
		
		Select drop=new Select(selectDropdown);
		//drop.selectByVisibleText("Red");
		//drop.selectByIndex(1);
		drop.selectByValue("Red");
	}
	
	
	public static void main(String[] args) {
		Dropdown_class dropDown=new Dropdown_class();
	dropDown.initializeBrowser();
	dropDown.dropdwonBox();
		
		}
		

	}


