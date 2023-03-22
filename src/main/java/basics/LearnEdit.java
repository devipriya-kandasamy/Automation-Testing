package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/input.xhtml;jsessionid=node076oynydx8n3m127fggems0b6u329887.node0");

		driver.manage().window().maximize();

		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.clear();
		name.sendKeys("Devi");
		
		System.out.println(name.getAttribute("value"));

		
		WebElement append = driver.findElement(By.id("j_idt88:j_idt91"));
		append.sendKeys("India");
		System.out.println(append.getAttribute("value"));
		
		WebElement disabled = driver.findElement(By.id("j_idt88:j_idt93"));
		System.out.println(disabled.isEnabled());
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
	

		WebElement retrive = driver.findElement(By.id("j_idt88:j_idt97"));
		System.out.println(retrive.getAttribute("value"));
		
		WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		email.sendKeys("a@a.com",Keys.TAB);
	
		WebElement error = driver.findElement(By.id("j_idt106:thisform:age"));
		error.sendKeys("hello, how are you",Keys.ENTER);
		
		
//		WebElement label = driver.findElement(By.id("j_idt106:j_idt113"));
//		System.out.println(label.getText());
		
		WebElement labeltxt = driver.findElement(By.id("j_idt106:float-input"));
		labeltxt.click();
		System.out.println(labeltxt.getAttribute("value"));				
	}

}
