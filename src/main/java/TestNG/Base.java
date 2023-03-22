package TestNG;

import org.testng.annotations.DataProvider;

public class Base {

	@DataProvider
	
	public  String[][] input() {
		
		String[][] arr = new String[2][2];
		
		arr[0][0]= "3";
		arr[0][1] = "20";
		
		arr[1][0]= "2";
		arr[1][1] = "20";
		return arr;
	}

}
