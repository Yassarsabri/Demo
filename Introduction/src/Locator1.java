import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/home/yassar/Downloads/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		
      // driver.findElement(By.xpath(".//*[@id='menu-navigation-main-menu']/li[8]/a")).click();
       
       driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("yassar@atlogys.com");
       
       driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("expert123");
       
       //driver.findElement(By.xpath(".//*[@id='u_0_5']")).click();
       
       driver.findElement(By.linkText("Forgotten account?")).click();
       
	}
	

}
