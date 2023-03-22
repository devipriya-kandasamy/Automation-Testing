package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learndropdown {

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
		
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd= new Select(element);
		
	//	dd.selectByVisibleText("Employee");
	//	dd.selectByValue("LEAD_PARTNER");
		dd.selectByIndex(8); //index starts with 1
		
		driver.findElement(By.name("submitButton")).click();


	}

}
