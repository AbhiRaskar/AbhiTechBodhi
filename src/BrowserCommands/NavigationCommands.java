package BrowserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommands {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions ch = new ChromeOptions();
	ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(ch);
	driver.get("https://www.google.co.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// navigate command
	driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
	// back command
	driver.findElement(By.xpath("//span[text()='PYTHON']")).click();
Thread.sleep(5000);
driver.navigate().back();
//forward command
Thread.sleep(5000);
driver.navigate().forward();
//refresh command
Thread.sleep(5000);
driver.navigate().refresh();
}
}