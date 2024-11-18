package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHandling  extends Baseclass{


	public static void main(String[] args) {
		AlertHandling handling=new AlertHandling();
		handling.initializeBrowser();
		handling.alertheadingert();
		handling.AlertConfirm();
		handling.AlertMessage();

	}

	public void alertheadingert() {
		WebElement alertheading=driver.findElement(By.xpath("//a[@id='alert-modal']"));
		alertheading.click();
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement JavaScriptAlert=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		JavaScriptAlert.click();
		driver.switchTo().alert().accept();
	}
	public void AlertConfirm() {
		WebElement Okbutton=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		Okbutton.click();
		driver.switchTo().alert().dismiss();
		
	}
	public void AlertMessage() {
		WebElement  Alertmsg=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Alertmsg.click();
		driver.switchTo().alert().sendKeys("Warning");
		driver.switchTo().alert().accept();
		System.out.println(Alertmsg.isDisplayed());
		
	}
}
	
