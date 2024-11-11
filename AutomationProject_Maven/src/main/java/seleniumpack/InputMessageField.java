package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputMessageField extends Baseclass {
	//click input form
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
	WebElement showButton=driver.findElement(By.xpath("//*[@id=\"button-one\"]"));
	showButton.click();
	}
	
	public void TwoInputFields() {
		WebElement entervalueA=driver.findElement(By.xpath("//*[@id=\"value-a\"]"));
		entervalueA.click();
		entervalueA.sendKeys("3");
	}
	
	public void TwoInputFields1() {
		WebElement entervalueB=driver.findElement(By.xpath("//input[@id='value-b']"));
		 entervalueB.click();
		 entervalueB.sendKeys("4");
		 
	}
public void getTotal() {
	WebElement total=driver.findElement(By.xpath("//*[@id=\"button-two\"]"));
	total.click();
}
	public static void main(String[] args) {
		InputMessageField field=new InputMessageField();
		field.initializeBrowser();
		field.getInputForm();
		field.showMessage();
		field.TwoInputFields();
		field.TwoInputFields1();
		field.getTotal();
		
		
		

	}

}
