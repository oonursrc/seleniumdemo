import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class explicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		WebDriverWait w =new WebDriverWait(driver,10);

		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		

	}

}
