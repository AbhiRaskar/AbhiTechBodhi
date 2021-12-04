package BrowserCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserCommands {
public static void main(String[] args) {
	ChromeOptions ch = new ChromeOptions();
	ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(ch);
	driver.get("https://www.google.co.in");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//get command to invoke browser
	driver.get("http://www.seleniumframework.com/Practiceform/");
	//get command to take title of page
String PageTitle =driver.getTitle();
System.out.println(PageTitle);
//get command to take current url
String PageCurrentURL =driver.getCurrentUrl();
System.out.println(PageCurrentURL);
//close and quit
driver.findElement((By.xpath("//button[text()='New Browser Tab']"))).click();

driver.quit();//ithe close ani quit coomand use karun diff. bagha

}
}
