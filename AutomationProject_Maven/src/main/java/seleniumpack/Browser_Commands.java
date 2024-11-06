package seleniumpack;

public class Browser_Commands extends Baseclass{
public void browserCommands() {
	String title=driver.getTitle();	
System.out.println(title);
String url=driver.getCurrentUrl();
System.out.println(url);
String pageSource=driver.getPageSource();
System.out.println(pageSource);

}
	public static void main(String[] args) {
		Browser_Commands commands=new Browser_Commands();
		commands.initializeBrowser();
		commands.browserCommands();

	}

}
