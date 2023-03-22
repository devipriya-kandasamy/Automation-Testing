package Actions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnKeys
{


	public static void main(String[] args) {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	FluentWait wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class);
			

	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	
	
	// Press Enter key in keyboard
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("\uE007");
	
	//click google search button
	//driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
	
	driver.close();
	

	
	}

}
