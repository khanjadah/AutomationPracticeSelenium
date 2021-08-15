package testModel01;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageModelBy.SignInPage;

public class SignInTestCase {

	WebDriver driver;
	WebDriverWait Ex;
	Actions build;
	JavascriptExecutor js;
	SignInPage obj1;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Ex = new WebDriverWait(driver, 6);
		build = new Actions(driver);
		js = (JavascriptExecutor) driver;
		obj1 = new SignInPage(driver);
	}

	@Test(priority = 0, invocationCount = 3)
	public void SignUPpage_Appear() {
		driver.get("http://automationpractice.com/index.php");
		obj1.OpenSignInForm("test.123@hotmail.com");

	}

	@AfterTest
	public void quit() {
		driver.close();
	}

}
