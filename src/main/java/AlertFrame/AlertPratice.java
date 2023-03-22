package AlertFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPratice {

	public static void main(String[] args) {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		
	}

}
