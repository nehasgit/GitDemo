package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PractiseParameters {

	//Parameterization in selenium is a process to parameterize the test scripts
	//in order to pass multiple data to the application at runtime
	//it is a strategy of execution which automatically runs test cases multiple times using different values
	
	//Parameter annotatio is a method used to pass values to the test methods as arguments using testng.xml file
	
	@Test
	@Parameters({"a","b"})
	public void  Sum(int a, int b) {
		int sum=a+b;
		
		System.out.println(sum);
	}
	
	@Test
	@Parameters({"a","b"})
	public void  Divide(int a, int b) {
		int divide=a/b;
		
		System.out.println(divide);
	}
	
	@Test
	@Parameters({"a","b"})
	public void  Multiply(int a, int b) {
		int multiply=a*b;
		
		System.out.println(multiply);
	}
}
