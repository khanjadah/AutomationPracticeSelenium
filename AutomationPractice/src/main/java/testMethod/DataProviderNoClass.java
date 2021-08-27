package testMethod;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseModel.BrowserSetup;

public class DataProviderNoClass extends BrowserSetup {
	
//	
//@Test(priority=0)
//public void noParameter() throws InterruptedException {
//	
//	String user = "Rony";
//	String value = "Dhaka";
//	
//	driver.get("https://google.com");
//	WebElement search = driver.findElement(By.name("q"));
//	Thread.sleep(3000);
//	search.sendKeys(value);
//}

//@Test(priority=1)
//@Parameters({"user","value"})
//public void withParameterXml( @Optional("abc") String user, @Optional("Dhaka") String value ) throws InterruptedException {
//	driver.get("https://google.com");
//	WebElement search = driver.findElement(By.name("q"));
//	
//	Thread.sleep(3000);
//	search.sendKeys(value);
//	Thread.sleep(3000);
//}
//@Test(dataProvider="SearchProvider", priority = 2)
//public void dataProvider1(String user, String value) {
//	
//	WebElement search = driver.findElement(By.name("q"));
//	search.clear();
//	search.sendKeys(value);
//
//}
//
//@DataProvider(name="SearchProvider")
//public Object[][] getDataFromDataprovider(){
//return new Object[][] {
//	{"Rony","Bangladesh"},
//	{"Rony","Dhaka"}
//	
//	
//};
//}
@BeforeTest(groups={"a","b"})	
public void setup() {
	
	driver.get("https://google.com");
}
@Test(dataProvider="SearchProvider2",groups="a")
public void dataProvider2(String user, String value) {
	
	WebElement search = driver.findElement(By.name("q"));
	//search.clear();
	search.sendKeys(value);
	String testValue = search.getAttribute("value");
    Assert.assertTrue(testValue.equalsIgnoreCase(value));
}

@Test(dataProvider="SearchProvider2",groups="b")
public void dataProvider3(String value) {

	WebElement search = driver.findElement(By.name("q"));
	search.clear();
	search.sendKeys(value);
	//search.clear();

	String testValue = search.getAttribute("value");
    Assert.assertTrue(testValue.equalsIgnoreCase(value));
}
//@DataProvider(name="SearchProvider2")
//public Object[][] getDataFromDataprovider(Method X){
//	if(X.getName().equalsIgnoreCase("dataProvider2")) {
//		
//		
//	
//return new Object[][] {
//	{"Rony","Bangladesh"},
//	{"Sumit","Madaripur"}
//	
//	
//};}
//	else {
//		return new Object[][] {
//			{"Bangladesh"},
//			{"Madaripur"}
//			
//			
//		};}
//	}

@DataProvider(name="SearchProvider2")
public Object[][] getDataFromDataprovider(ITestContext c){
Object[][] groupArray = null;
	for (String group : c.getIncludedGroups()) {
	if(group.equalsIgnoreCase("a")){
		groupArray = new Object[][] { 
				{ "Rony", "Bangladesh" }, 
				{ "Sumit", "Dhaka" }
			};
	break;	
	}
		else if(group.equalsIgnoreCase("b"))
		{
		groupArray = new Object[][] { 
					{  "Bangladesh" }, 
					{  "Madaripur" }
				};
		}
	break;
}
return groupArray;		
}
}

		

