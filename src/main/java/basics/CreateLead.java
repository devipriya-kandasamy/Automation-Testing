package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("infy");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Hello");
		
		driver.findElement(By.name("submitButton")).click();
		
		String fname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(fname);
		System.out.println(driver.getTitle());
		//driver.close();
		
	}

}
