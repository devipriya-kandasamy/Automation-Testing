package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();

		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Happy");
		driver.findElement(By.id("lastNameField")).sendKeys("Happy");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("demo");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sale");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("a@a.com");
		
		WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd= new Select(element);
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
	
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
			//hello
	}

}
