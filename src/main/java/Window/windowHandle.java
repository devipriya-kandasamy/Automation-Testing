package Window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
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
		
	//	String mainwindow = driver. getWindowHandle();
		
		Set<String> allWindows = driver. getWindowHandles();
		List<String> allHandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allHandles.get(2));
		
		for (String singlewindow : allHandles) {
			System.out.println(singlewindow);
			
		}

		
		
		
		

	}

}
