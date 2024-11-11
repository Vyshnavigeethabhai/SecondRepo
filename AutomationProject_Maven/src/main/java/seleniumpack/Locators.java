package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Baseclass {

    public void idLocator() {
        // Locating elements by different locators
        WebElement inputForm = driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
        WebElement messageField = driver.findElement(By.id("single-input-field"));
        WebElement homeLogo = driver.findElement(By.className("top-logo"));
        WebElement sideMenu = driver.findElement(By.linkText("Checkbox Demo"));
    }

    public void namelocator() {
        WebElement name = driver.findElement(By.name("viewport"));
    }

    public void class_locator() {
        WebElement class1 = driver.findElement(By.className("form-control"));
    }

    public void tagandidcombo() {
        // Combination of tag and id
        WebElement csstag = driver.findElement(By.cssSelector("input#single-input-field"));
    }  // Removed extra closing parenthesis and ensured correct method closure

    public void tagclasscombo() {
        // Combination of tag and class
        WebElement css1 = driver.findElement(By.cssSelector("ul.navbar-nav"));
    }

    public void tag_attributecombo() {
        // Combination of tag and attribute
        WebElement cs1 = driver.findElement(By.cssSelector("div[id='message-one']"));
    }

    public void tag_class_attribute() {
        // Combination of tag, class, and attribute
        WebElement tag_class = driver.findElement(By.cssSelector("button.btn.btn-primary[id='button-two']"));
        WebElement cs2 = driver.findElement(By.cssSelector("input.form-control[id='single-input-field']"));
    }
    public void absolutexpath() {
    	 WebElement abspath = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button"));
    }
    public void relativexpath() {
    	 WebElement rlvpath = driver.findElement(By.xpath("//button[@id='button-one']"));
    }
    public void containsxpath( ) {
    	//dynamic xpath(//tagname[contains(@attributetype,'value')]
    	 WebElement containspath = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
    }
    public void textpath() {
    	////tagname[text()='value']
    	 WebElement textpath1 = driver.findElement(By.xpath("//button[text()='Show Message']"));
    }
    public void axespathparent( ) {
    	//tagnem[@attributetype='value']//parent::tagname
    	WebElement accespath= driver.findElement(By.xpath("//input[@id='single-input-field']//parent::div"));
    }
    public void axespathchild() {
    	//tagnem[@attributetype='value']//child::tagname
    	WebElement accespath1= driver.findElement(By.xpath("//a[@href='index.php']//child::img"));	
    }
    
    public static void main(String[] args) {
        Locators locate = new Locators();
        locate.initializeBrowser();
        locate.idLocator();
        locate.namelocator();
        locate.class_locator();
        locate.tag_attributecombo();
    }
}

