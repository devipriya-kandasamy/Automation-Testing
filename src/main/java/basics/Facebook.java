package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.name("firstname")).sendKeys("Wen");
		driver.findElement(By.name("lastname")).sendKeys("Wen");
		driver.findElement(By.name("reg_email__")).sendKeys("asdf@as.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Awsderet");
		
		WebElement eleMonth = driver.findElement(By.id("month"));
		Select month = new Select(eleMonth);
		month.selectByVisibleText("Jun");
		
		WebElement eleDay = driver.findElement(By.id("day"));
		Select day = new Select(eleDay);
		day.selectByVisibleText("18");

		WebElement eleYear = driver.findElement(By.id("year"));
		Select year = new Select(eleYear);
		year.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
			

			
		}

}
