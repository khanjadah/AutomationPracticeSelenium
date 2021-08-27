package baseModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	public static WebDriverWait Ex;
	 
    public static WebDriver driver=null;
	Actions build;
	 
	
	@BeforeSuite
	public void browsersetup() {
	    WebDriverManager.chromedriver().setup();
	    WebDriverManager.firefoxdriver().setup();
	    driver=new ChromeDriver ();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Ex=new WebDriverWait(driver, 6);    
	    driver.get("http://automationpractice.com/index.php");
	}
	@AfterSuite
	public void endoftest() {
	BrowserSetup.driver.quit();
	    
	}


}
