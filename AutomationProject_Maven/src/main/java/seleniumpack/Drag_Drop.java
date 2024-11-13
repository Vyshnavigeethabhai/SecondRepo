package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop extends Baseclass{
	public void dragDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1=driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(drag1);
		actions.doubleClick(drag1).perform();
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		actions.dragAndDrop(drag1, destination).build().perform();
		
	}

	public static void main(String[] args) {
		Drag_Drop obj  = new Drag_Drop();
		obj.initializeBrowser();
		obj.dragDrop();
		
	}

}
