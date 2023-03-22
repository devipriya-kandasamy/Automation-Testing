package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAction {

	public static void main(String[] args) {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");// instead of system property use remoteallow origins
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.snapdeal.com/");
		WebElement element = driver.findElement(By.xpath("//span[@class='catText']"));
		WebElement element1 = driver.findElement(By.xpath("//span[text()='Shirts']"));

		Actions action = new Actions(driver);
		
		action.moveToElement(element).click(element1).perform();
		
		WebElement element3 = driver.findElement(By.className("picture-elem"));
		
		action.doubleClick(element3).perform();
		
	
		
//		WebElement element2 = driver.findElement(By.xpath("//span[@class='animated-icon']"));
		
//		action.moveToElement(element2)
//		.click(driver.findElement(By.xpath("//div[contains(text(),'Quick')]"))).perform();
//		
		
	}

}
