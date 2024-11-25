package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Clientspage_actions extends LoginPage{
	public WebDriver driver;
	
	
public Clientspage_actions(WebDriver driver) throws AWTException{
	super(driver);
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
}

//Locate the elements
@FindBy(xpath="//input[@id='clientsearch-client_name']")WebElement clientName;
@FindBy(xpath="//input[@id='clientsearch-id']")WebElement clientId;
@FindBy(xpath="//button[@class='btn btn-primary']")WebElement searchButton;
@FindBy(xpath="//div[@id=\"w1\"]/table/tbody/tr")WebElement searchresult;

public void enter_searchname() {
	clientName.sendKeys("Sam");
}
public void enter_clinetid() {
	clientId.sendKeys("3");
}
public void click_search() throws AWTException {
	searchButton.click();
	Robot robot=new Robot();
	robot.delay(1000);
}
public boolean isSearchResultShown() {
	return searchresult.isDisplayed();
}
}


