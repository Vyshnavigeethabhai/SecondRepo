package testScript;


import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Baseclass{
  @Test
  public void verifyUserIsAbleToLoginValidCredenstials () throws AWTException {
	  LoginPage login=new LoginPage(driver);
	  login.enterUsername_Field("carol");
	  login.enterPassword_Field("1q2w3e4r");
	  login.click_loginButton();
	  boolean isHomepageShowing=login.isDashbordloaded();
	assertTrue(isHomepageShowing, "Home page is not Loaded");
  }
}
