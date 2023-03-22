package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import TestNG.Base;

public class Calculator extends Base {
	
	@BeforeMethod
	public void add() {
		System.out.println("Add");
	}

	@BeforeClass
	public void sub() {
		System.out.println("sub");
	}
	
	@Test(dataProvider = "input")
	public void mul(String arr1 , String arr2) {
			
			System.out.println("mul"+ arr1+arr2);
		}
		
	
	@AfterMethod
	public void div() {
		System.out.println("sub");
	}


}
