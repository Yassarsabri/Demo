import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver","/home/yassar/Downloads/chromedriver" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		int count=driver.findElements(By.xpath(".//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath(".//input[@name='group1']")).get(i).click();
			
			 System.out.println(driver.findElements(By.xpath(".//input[@name='group1']")).get(i).getText());
		}
		

	}

}
