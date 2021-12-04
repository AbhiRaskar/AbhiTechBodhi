package InputBoxandButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InputBoxandButton {
public static void main(String[] args) {
	ChromeOptions ch = new ChromeOptions();
	ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(ch);
	driver.get("https://facbook.com/");
	
	driver.findElement(By.id("email")).sendKeys("Abhi");
	driver.findElement(By.name("password")).sendKeys("abc");
	driver.findElement(By.name("login")).click();
}
}
