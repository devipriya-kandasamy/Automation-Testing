package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://leafground.com/frame.xhtml");
		
		WebElement frame1 = driver.findElement(By.xpath("//div[@class='card']/iframe"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
	
		
//		WebElement frame2 = driver.findElement(By.xpath("(//div[@class='card']/iframe)[2]"));
//		driver.switchTo().frame(frame2);
		
		
		WebElement element = driver.findElement(By.xpath("(//div[@class='card'])[2]/h5"));
		System.out.println(element.getText());
		
		
		WebElement frame3 = driver.findElement(By.xpath("(//div[@class='card']/iframe)[3]"));
		driver.switchTo().frame(frame3);
		driver.switchTo().frame("frame2");

		driver.findElement(By.id("Click")).click();

		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
	}

}
