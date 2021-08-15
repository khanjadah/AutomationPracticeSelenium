package pageModelAtFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SingUpPage {

	WebDriver driver;

	@FindBy(css = "#id_gender1")
	WebElement Mr;

	@FindBy(xpath = "//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")
	WebElement Mrs;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement FirstName;

	@FindBy(xpath = "//input[@id='customer_lastname'][@type='text']")
	WebElement LastName;

	@FindBy(css = "\"input[type$='rd']\"")
	WebElement Password;

	@FindBy(css = "select[id='days']")
	WebElement Days;

	@FindBy(css = "select#months")
	WebElement Months;

	@FindBy(xpath = "//select[starts-with(@id,'years') or (@name='years')]")
	WebElement Years;

	@FindBy(css = "#newsletter")
	WebElement CheckBoxNewsLatter;

	@FindBy(css = "input[id*='optin']")
	WebElement Receivespecialoffers;

	@FindBy(css = "input[id^='comp']")
	WebElement Company;

	@FindBy(xpath = "//*[@id='address1' or @name='address1']")
	WebElement Address;

	@FindBy(xpath = "input[name$='ty']")
	WebElement City;

	@FindBy(css = "select[id='id_state']")
	WebElement State;

	@FindBy(xpath = "//input[@id='postcode'][@name='postcode']")
	WebElement Zip;

	@FindBy(xpath = "textarea[id='other']")
	WebElement AddiInfo;

	@FindBy(css = "input[name^='pho']")
	WebElement HomePhone;

	@FindBy(xpath = "//input[starts-with(@name,'phone_mobile') or (@id='phone_mobile')]")
	WebElement MobileNumber;

	@FindBy(css = "#alias")
	WebElement FutureEmail;

	public SingUpPage(WebDriver driver) { // class constructor
		this.driver = driver;
	}

	public String getMainPageTitle() {
		return driver.getTitle();
	}

	public void Mr() {
		Mr.click();
		Assert.assertEquals(true, Mr.isSelected());
		System.out.println("-----Mr Button is selected!!");

	}

	public void Mrs() {
		Mrs.click();
		Assert.assertEquals(true, Mrs.isSelected());
		System.out.println("-----Mrs Button is selected!!");

	}

	public void FirstName(String firstname) {
		FirstName.sendKeys(firstname);
		Assert.assertEquals(true, FirstName.getAttribute("value"));
		System.out.println("-----FirstName!!");
	}

	public void LastName(String lastname) {
		LastName.sendKeys(lastname);
		Assert.assertEquals(true, LastName.getAttribute("value"));
		System.out.println("-----LastName!!");

	}

	public void Days(int d) {
		Days.click();
		Select daysvalue = new Select(Days);
		daysvalue.selectByIndex(d);
		String Option = daysvalue.getFirstSelectedOption().getText();
		Assert.assertEquals(d, Option);
		System.out.println("-----Day is Selected!!");
	}

	public void Months(String m) {
		Months.click();
		Select monthsvalue = new Select(Months);
		monthsvalue.selectByValue(m);
		String Option = monthsvalue.getFirstSelectedOption().getText();
		Assert.assertEquals(m, Option);
		System.out.println("-----Month is Selected!!");

	}

	public void Years(String y) {
		Years.click();
		Select yearsvalue = new Select(Years);
		yearsvalue.selectByValue(y);
		String Option = yearsvalue.getFirstSelectedOption().getText();
		Assert.assertEquals(y, Option);
		System.out.println("-----Year is Selected!!");

	}

	public void Password(String password) {
		Password.sendKeys(password);
		Assert.assertEquals(true, Password.getAttribute("value"));
		System.out.println("-----Password!!");

	}

	public void Receivespecialoffers() {
		Receivespecialoffers.click();
		Assert.assertEquals(true, Receivespecialoffers.getAttribute("value"));
		System.out.println("-----Receivespecialoffers!!");
	}

	public void Company(String company) {
		Company.sendKeys(company);
		Assert.assertEquals(true, Company.getAttribute("value"));
		System.out.println("-----Company!!");
	}

	public void Address(String address) {
		Address.sendKeys(address);
		Assert.assertEquals(true, Address.getAttribute("value"));
		System.out.println("-----Adress!!");
	}

	public void City(String city) {
		City.sendKeys(city);
		Assert.assertEquals(true, City.getAttribute("value"));
		System.out.println("-----City!!");
	}

	public void State(String s) {
		State.click();
		Select statevalue = new Select(State);
		statevalue.selectByValue(s);
		String Option = statevalue.getFirstSelectedOption().getText();
		Assert.assertEquals(s, Option);
		System.out.println("-----State is Selected!!");
	}

	public void Zip(String zip) {
		Zip.sendKeys(zip);
		Assert.assertEquals(true, Zip.getAttribute("value"));
		System.out.println("-----Zip!!");
	}

	public void AddiInfo(String addiinfo) {
		AddiInfo.sendKeys(addiinfo);
		Assert.assertEquals(true, AddiInfo.getAttribute("value"));
		System.out.println("-----AdditionalInfo!!");
	}

	public void HomePhone(int ph) {
		HomePhone.sendKeys();
		Assert.assertEquals(true, HomePhone.getAttribute("value"));
		System.out.println("-----HomePhoneNumber!!");
	}

	public void MobileNumber(int mp) {
		MobileNumber.sendKeys();
		Assert.assertEquals(true, MobileNumber.getAttribute("value"));
		System.out.println("-----MobilePhoneNumber!!");
	}

	public void FutureEmail(String futureemail) {
		FutureEmail.sendKeys(futureemail);
		Assert.assertEquals(true, FutureEmail.getAttribute("value"));
		System.out.println("-----MobilePhoneNumber!!");
	}

}
