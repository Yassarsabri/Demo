import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","/home/yassar/Downloads/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
	
		
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window("https://www.google.co.in");
		
		

	}

}
