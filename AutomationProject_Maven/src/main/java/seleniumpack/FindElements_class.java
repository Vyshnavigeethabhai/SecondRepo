package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements_class extends Baseclass{
	public void getInputForm() {
		WebElement inputform=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		inputform.click();
	}
	
	public void showMessage() {
		//find messageField
	List<WebElement> messageField=driver.findElements(By.xpath("//input[@type='text']"));
	
		for(WebElement messageField1:messageField)
		{
			messageField1.sendKeys("Welcome");
		}
		
	
	}

	public static void main(String[] args) {
		FindElements_class object=new FindElements_class();
				object.initializeBrowser();
		object.getInputForm();
		object.showMessage();

	}

}
