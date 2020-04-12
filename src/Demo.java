import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\z003srtv\\Documents\\SeleniumDocs\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.id("email")).sendKeys("kankim@k.com");
		//driver.findElement(By.name("pass")).sendKeys("abc123");
		//driver.findElement(By.id("u_0_2")).click();
		//driver.findElement(By.linkText("Passwort vergessen?")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("kankim@k.com");
	}

}
