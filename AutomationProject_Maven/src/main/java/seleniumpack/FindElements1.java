package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements1 extends Baseclass {
	public void checkboxPage() {
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkboxes1:checkboxes ) {
			checkboxes1.click();
			System.out.println(checkboxes1.isEnabled());
			
		}
	}
	public static void main(String[] args) {
		FindElements1 find=new FindElements1();
		find.initializeBrowser();
		find.checkboxPage();

	}

}
