package capabalities;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capabality {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
	}

}
