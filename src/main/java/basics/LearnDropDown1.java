package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/select.xhtml");

		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		
		Select dropdown = new Select(element);
		List<WebElement> ddoptions = dropdown.getOptions();
		int size = dropdown.getOptions().size();
		
		System.out.println(size);
		
		for (WebElement eachElement : ddoptions) {
			
			System.out.println(eachElement.getText());
								
		}
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
	}

}
