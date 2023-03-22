package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	public ChromeDriver driver;

	
	@Given ("Open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();    
	}
	
	@Given("Load the application URL")
	public void loadApplicationUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	   
	}
	
	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}
	
	@When("Click on login button")
	public void loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@Then("Homepage should be displayed")
	public void homepage() {
		
		boolean displayed = driver.findElement(By.partialLinkText("CRM/SFA")).isDisplayed();
		if(displayed)
			System.out.println("Homepage is Displayed");
		else
			System.out.println("Homepage Not displayed");
	    
	}


}
