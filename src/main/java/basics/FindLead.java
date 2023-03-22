package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		
//		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//		
//		driver.findElement(By.name("phoneAreaCode")).sendKeys("600096");
//		
//		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
//	click first element
		driver.findElement(By.cssSelector("table[class*='x-grid3-row-table']>tbody>tr>td a"))
				.click();


	}

}
