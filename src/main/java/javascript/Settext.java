package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Settext {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml;jsessionid=node0bb6vb3hjczjd3ae3rsalpmz2140999.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//div[contains(@class,'ql-editor')]")).sendKeys("hello Devi");
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		
		WebElement textArea = driver.findElement(By.xpath("(//div[contains(@class,'ql-editor')])[2]"));
		//set the text
		jsExecutor.executeScript("arguments[0].setAttribute('data-placeholder','Hi Pradeep')",textArea);  
		//get the text
		String text = (String) jsExecutor
				.executeScript("return arguments[0].getAttribute('data-placeholder')",textArea);  
		System.out.println(text);  

	}

}
