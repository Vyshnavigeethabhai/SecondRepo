package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Checkbox_class extends Baseclass {
	public void getInputForm() {
		WebElement inputform=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		inputform.click();
	}
	
	public void showMessage() {
		//find messageField
		WebElement messageField=driver.findElement(By.xpath("//*[@id=\"single-input-field\"]"));
		//click the field
		messageField.click();
		//give  message to the field
	messageField.sendKeys("Welcome");
	System.out.println(messageField.isEnabled());
	
}
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkboxid=driver.findElement(By.xpath("//input[@id='gridCheck']"));
	//	checkboxid.click();
		System.out.println(checkboxid.isSelected());
	}
public void radioButton() {
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement radiobtn=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
	radiobtn.click();
	System.out.println(radiobtn.isSelected());
}
	public static void main(String[] args) {
		Checkbox_class box=new Checkbox_class();
		box.initializeBrowser();
		box.getInputForm();
		box.showMessage();
		box.checkBox();
		box.radioButton();
	

	}

}
