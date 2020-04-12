import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String newWindow = "New Window";
		String mainWindow = "Opening a new window";

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();

		String parentid = iter.next();
		String childid = iter.next();

		driver.switchTo().window(childid);

		String s = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();

		Assert.assertEquals(s, newWindow);

		System.out.println(s);

		driver.switchTo().window(parentid);

		String s1 = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
		Assert.assertEquals(s1, mainWindow);
		System.out.println(s1);

	}

}
