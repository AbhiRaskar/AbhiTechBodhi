package ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
		//get command to invoke browser
		driver.get("https://www.browserstack.com/.");
Actions as = new Actions(driver);
WebElement element = driver.findElement(By.xpath("//button[@aria-label='Products']"));
as.moveToElement(element).build().perform();
	}
}