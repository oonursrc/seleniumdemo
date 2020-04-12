


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class autocompletedropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("autocomplete")).sendKeys("Tur");
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);	
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		
		String text= driver.findElement(By.id("autocomplete")).getText();
		
		Assert.assertEquals("Turkey", "Turkey");

	}

}
