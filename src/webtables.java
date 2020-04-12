
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		//Rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		System.out.println("Rows: "+ rows.size());
		
		List<WebElement> colums = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th"));
		System.out.println("Colums: "+ colums.size());
		
		
		for (int i =0;i<colums.size();i++)
		{
			String element = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[3]/td")).get(i).getText();
			System.out.println(element);
		}

	}

}
