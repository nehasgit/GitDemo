package test;

import org.testng.annotations.Test;

public class PractiseAttributes {

	//A method with dependsOnMethods attributes will only run when the method on which it is dependent got passed successfully or run successfully
	
	//@Test(dependsOnMethods= {"B","D"})
	@Test(priority=5)
	public void A() {
		System.out.println("A");
	}
	
	
	//description attribute provides information about the test
	
	//@Test(description="This is testcase B")
	@Test
	public void B() {
		System.out.println("B");
	}
	
	//@Test(dependsOnMethods= {"A"})
	//Enabled accepts boolean value. by default its true. if we want to skip any test method, we can set enabled=false
	@Test(enabled=false)
	public void C() {
		System.out.println("C");
	}
	
	
	@Test(priority=3)
	public void D() {
		System.out.println("D");
	}
	
	//determines the sequence of the execution of the test cases.
	@Test
	public void E() {
		System.out.println("E");
	}
	
	
	@Test
	public void F() {
		System.out.println("F");
	}
	
	//timeout is a time period provided to the test acse to completely execute its test cases
	//@Test((timeOut=100)
	@Test(groups={"Fruits"})
	public void Apple() {
		System.out.println("Apple");
		
	}
		@Test(groups={"Fruits"})
		public void Mango() {
			System.out.println("Mango");

}}
