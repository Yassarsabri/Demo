import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolutepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","/home/yassar/Downloads/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/interview.php");
		
		driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/following-sibling::li[2]")).click();
		

	}

}
