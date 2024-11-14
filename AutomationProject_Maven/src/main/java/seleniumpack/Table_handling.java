package seleniumpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table_handling extends Baseclass {
	
	public void Tablehandlinf() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void tableraw() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableraw=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
		System.out.println(tableraw.getText());
	}
	public void particularElement() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableelement=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(tableelement.getText());
	}
	public void searchrawElement() {
		String name="Brielle Williamson";
		List<WebElement>search=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement search1:search ) {
			if(search1.getText().equals(name))
			{
			System.out.println("element is present"+search1.getText());
		}
	}
	}
		public void particulartablecolumn() {
			List<WebElement> Tabcol=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
			for(WebElement Tabcol1:Tabcol) {
			System.out.println(Tabcol1.getText());
		}
	}

public void searchcolElement() {
	String name1="Accountant";
	List<WebElement> searchname=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
	for(WebElement searchname1:searchname) {
		if(searchname1.getText().equalsIgnoreCase(name1)) 
		{
		System.out.println("Column element search result:"+ searchname1.getText());
		}
	}
}
	public static void main(String[] args) {
		Table_handling handling=new Table_handling();
		handling.initializeBrowser();
		handling.Tablehandlinf();
		System.out.println("*****");
		handling.tableraw();
		System.out.println("*****");
		handling.particularElement();
		System.out.println("*****");
		handling.searchrawElement();
		System.out.println("*****");
		handling.particulartablecolumn();
		System.out.println("*****");
		handling.searchcolElement();
		

	}

}
