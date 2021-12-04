package SwitchToFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
driver.switchTo().frame(driver.findElement(By.name("iframe_a")));
Thread.sleep(2000);
driver.findElement(By.xpath("//h2[text()='Jobs in India']//following::a[1]")).click();
//driver switch to ().defaultContent();
List<WebElement> iframeElement = driver.findElements(By.tagName("iframe"));
List<WebElement> iframeElements = null;
System.out.println("Total number of iframes are " + iframeElements.size());
}
}
