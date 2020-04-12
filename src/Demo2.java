import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003srtv\\Documents\\SeleniumDocs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=eng");
		
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.cssSelector("input[type*='email']")).sendKeys("kankim");

}
	}
