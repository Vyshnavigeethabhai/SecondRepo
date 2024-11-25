package testScript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pages.Clientspage_actions;
import pages.LoginPage;

public class clientsearchTest extends Baseclass{
  @Test
  public void verifytheloginandClientPage () throws AWTException, InterruptedException {
	 
	  LoginPage login=new LoginPage(driver);
	  login.enterUsername_Field("carol");
	  login.enterPassword_Field("1q2w3e4r");
	  login.click_loginButton();
	  boolean isHomepageShowing=login.isDashbordloaded();
	assertTrue(isHomepageShowing, "Home page is not Loaded");
 

    driver.get("https://www.qabible.in/payrollapp/client/index");
	  Thread.sleep(1000);
 
	  Clientspage_actions actions=new Clientspage_actions(driver);
	 
	  actions.enter_searchname();
	  actions.enter_clinetid();
	  actions.click_search();
	 boolean issearchResultshowing=actions.isSearchResultShown();
	 assertTrue(issearchResultshowing, "Search result shown");
  }
}
