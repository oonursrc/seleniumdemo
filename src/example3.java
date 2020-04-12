import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class example3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		driver.findElement(By.id("FromTag")).sendKeys("Istanbul, TR - Ataturk (IST)");
		driver.findElement(By.id("ToTag")).sendKeys("Ankara, TR - Esenboga (ESB)");

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");

		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("2");

		driver.findElement(By.id("MoreOptionsLink")).click();

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Pegasus (PC)");

		driver.findElement(By.id("SearchBtn")).click();

	}

}
