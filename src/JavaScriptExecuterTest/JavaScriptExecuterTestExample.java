package JavaScriptExecuterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecuterTestExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
		//get command to invoke browser
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		//vertical scroll - down by 500 pixels
		js.executeScript("window.scrollBy(0,500)");
		//horizontal
		js.executeScript("window.scrollBy(0,500)");
		//go till last
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		//enter text
		js.executeScript("document.getElementById('enterText').value='Abhi';");
		//refresh
		js.executeScript("history.go(0)");
		js.executeScript("location.reload()");
		//size 
		System.out.println(js.executeScript("return.window.innerHeight;"));
		System.out.println(js.executeScript("return.window.innerWidth;"));
		}
}