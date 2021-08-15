package testMethod;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandle {
	
	WebDriver driver;
	WebDriverWait Ex;
	Actions build;
	JavascriptExecutor js; 

	@BeforeTest 
	public void setup() {
		
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver ();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Ex=new WebDriverWait(driver, 6);
	build=new Actions(driver);
	js=(JavascriptExecutor) driver;

	}

	@Test (priority=0)
	public void frame() throws InterruptedException {
	driver.get("http://automationpractice.com/index.php"); Thread.sleep(1000);//index 0
	js.executeScript("window.open('https://www.facebook.com/')"); Thread.sleep(1000);//index 2
	js.executeScript("window.open('https://github.com/')"); Thread.sleep(1000); //index 1
	ArrayList<String> Tab=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(Tab.get(0));


}
	
}
