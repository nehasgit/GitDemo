package test;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParameter {

	
	@DataProvider (name="testdata")
	public Object[][] TestDataFeed(){
		return new Object[][] {{"hi"}};
		
	}
	
	//providing multiple values in single parameter
	@DataProvider (name="testdata1")
	public Object[][] TestDataFeed1(){
		return new Object[][] {{2,4,6},{7,9,10}};
		
	}
	
	//DataProvider with Method as a parameter
	@DataProvider (name="testdata2")
	public Object[][] TestDataFeed2(Method m){
		switch(m.getName()) {
		case "Sum":
			return new Object[][]  {{2,4,6},{7,9,10}};
		case "Diff":
			return new Object[][]  {{10,4,6},{19,9,10}};	
		}
		return null;
		
	}
}
