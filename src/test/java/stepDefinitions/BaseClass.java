package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
static WebDriver driver;
	
	public static void browseConfigChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();
	}
	
	public static void openUrl(String url) {
		driver.get(url);
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void stop() {
		driver.quit();
	}
	public WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	
	public static void textInput(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public WebElement locateByName(String name) {
		WebElement findElement = driver.findElement(By.name(name));
		return findElement;
	}

	
	public static WebElement locateByXPath(String xpath) {
		WebElement findElement = driver.findElement(By.xpath(xpath));
		return findElement;
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();

	}
	
	public void CurrentURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	
	public String getTheText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
		return text;
	}
	public static void scrollBy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,600)");

	}
	
	public String getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
		return attribute;
	}
	
	public static void dndByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public void dndByVisibleText (WebElement element, String value) {
		Select s = new Select(element);
		
		s.selectByVisibleText(value);
	}
	
	public void dndByValue (WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}


}
