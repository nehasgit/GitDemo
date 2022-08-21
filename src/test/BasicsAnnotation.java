package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsAnnotation {
	
	//Hierarchy of testng annotation
	//BeforeSuite->BeforeTest->BeforeClass->BeforeMethod->Test->AfterMethod
	//->AfterClass->AfterTest->AfterSuite

	@BeforeClass
	public void Demo() {
		System.out.println(" will print after the 1st method of the current class");
		System.out.println(" will print after the 1st method of the current class1");
		System.out.println(" will print after the 1st method of the current class2");
	}
	
	@AfterTest
	public void Demo1() {
		System.out.println("will print after the exection of all the test methodsof available classes belonging to that folder");
	}
	
	//A method with dependsOnMethods attributes will only run when the method on which it is dependent got passed successfully or run successfully
	@AfterClass
	public void Demo2() {
		System.out.println("will print after the exection of all the test method of the current class");
	}

	//description attribute provides information about the test
	
	@Test(description="This is testcase")
	public void Test() {
		System.out.println("Test");
	}
	
	//A method with dependsOnMethods attributes will only run when the method on which it is dependent got passed successfully or run successfully
	
		@Test(dependsOnMethods= {"Demo5"})
		public void Test1() {
			System.out.println("Test1");
		}

	@AfterMethod
	public void Demo3() {
		System.out.println("will print after the exectuion of each method");
	}
	
	@AfterSuite
	public void Demo4() {
		System.out.println("will print after the execution of all the test methods in the suite");
	}
	
	@BeforeMethod
	public void Demo5() {
		System.out.println("will print before each test method will run");
	}
	
	@BeforeSuite
	public void Demo6() {
		System.out.println("will print before the exceution the execution of all the test methods in the suite");
	}

	@BeforeTest
	public void Demo7() {
		System.out.println("will print before the execution of all the test methods of availble classes belonging to that folder");
	}
	
	@BeforeGroups
	public void Demo8() {
		System.out.println("run only once for a group before the execution of all test cases belonging to that group");
	}
	
	@AfterGroups
	public void Demo9() {
		System.out.println("run only once for a group after the execution of all test cases belonging to that group");
	}
}
