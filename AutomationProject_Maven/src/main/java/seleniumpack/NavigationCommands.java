package seleniumpack;

public class NavigationCommands extends Baseclass{
public void navigateCommands()
{
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();;
}
	public static void main(String[] args) {
		NavigationCommands navigate=new NavigationCommands();
navigate.initializeBrowser();
navigate.navigateCommands();
	}

}
