import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/home/yassar/Selenium Tools/geckodriver");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.getCurrentUrl();
		
		

	}

}
