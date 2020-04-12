
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class tabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub



		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.id("checkBoxOption1")).click();
		
		String cText = driver.findElement(By.id("checkBoxOption1")).getText();
		
		System.out.println(cText);

		/*Select s= new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(cText);
		
		driver.findElement(By.id("name")).sendKeys(cText);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String aText = driver.switchTo().alert().getText();
		
		Assert.assertTrue(aText.contains(cText));*/
		

	}

}
