package pages;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
	@FindBy(id="loginform-username")WebElement username;
	@FindBy(id="loginform-password")WebElement password;
	@FindBy(xpath="//button[@class='btn btn-default']")WebElement submitbutton;
	@FindBy(xpath="//a[@href='/payrollapp/site/index']")WebElement dashboard;
	

	
	public void enterUsername_Field(String usernameField) {
		username.sendKeys(usernameField);
	}
	public void enterPassword_Field( String passwordField) {
		password.sendKeys(passwordField);
	}
	public void click_loginButton() throws AWTException  {
		submitbutton.click();
		Robot robo=new Robot();
		robo.delay(1000);
	}
	
	public boolean isDashbordloaded() {
	return dashboard.isDisplayed();
}
}