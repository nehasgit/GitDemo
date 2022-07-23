package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParameterTest {

	
	/*@DataProvider (name="testdata")
	public Object[][] TestDataFeed(){
		return new Object[][] {{"hi"},{"Neha"},{"Thanks"}};
		
	}*/
	//we can kep the dataprovider and test method in the same class and for that just dont need to give additional attribute dataProviderClass
	@Test(dataProvider="testdata", dataProviderClass=DataProviderParameter.class)
	public void myTest(String value) {
		System.out.println(value);
		}
	
	
	@Test(dataProvider="testdata1", dataProviderClass=DataProviderParameter.class)
	public void myTest(int a,int b, int sum) {
		int sum1=a+b;
	Assert.assertEquals(sum, sum1);
	}
	
	//Methods
	@Test(dataProvider="testdata2", dataProviderClass=DataProviderParameter.class)
	public void Sum(int a,int b, int sum) {
		int sum1=a+b;
	Assert.assertEquals(sum, sum1);
	}
	
	@Test(dataProvider="testdata2", dataProviderClass=DataProviderParameter.class)
	public void Diff(int a,int b, int sub) {
		int sub1=a-b;
	Assert.assertEquals(sub, sub1);
	
}
}