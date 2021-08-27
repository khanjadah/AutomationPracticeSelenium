package testMethod;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	
	@DataProvider(name="SearchProvider2")
	public Object[][] getDataFromDataprovider(Method X){
		if(X.getName().equalsIgnoreCase("dataProvider3")) {
			
			
		
	return new Object[][] {
		{"Rony","Bangladesh"},
		{"Sumit","Madaripur"}
		
		
	};}
		else {
			return new Object[][] {
				{"Bangladesh"},
				{"Madaripur"}
				
				
			};}
		}
	}

