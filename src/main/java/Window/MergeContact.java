package Window;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following::img")).click();

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowList= new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windowList.get(1));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().defaultContent();
		

	}

}
