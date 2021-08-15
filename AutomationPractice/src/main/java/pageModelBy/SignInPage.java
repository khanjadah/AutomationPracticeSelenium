package pageModelBy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

	WebDriver driver;
	WebDriverWait Ex;
	Actions build;
	JavascriptExecutor js;

	By URL = By.tagName("title");
	By SignIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
	By Email = By.xpath("//*[@id=\"email_create\"]");
	By CreateAccount = By.xpath("//*[@id=\"SubmitCreate\"]");

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getMainPageTitle() {

		return driver.getTitle();

	}

	public void ClickSignIn() {
		driver.findElement(SignIn).click();
	}

	public void TypeEmail(String email) {
		driver.findElement(Email).sendKeys(email);

	}

	public void ClickCreateAccount() {
		driver.findElement(CreateAccount).click();

	}

	public void OpenSignInForm(String email) {
		this.getMainPageTitle();
		this.ClickSignIn();
		this.TypeEmail(email);
		this.ClickCreateAccount();

	}

}
