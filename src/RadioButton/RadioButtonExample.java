package RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadioButtonExample {
public static void main(String[] args) {
	ChromeOptions ch = new ChromeOptions();
	ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(ch);
	driver.get("https://omayo.blogspot.com");
	boolean RadioButtonSelected = driver.findElement(By.xpath("//input[@value='Bike']")).isSelected();
	System.out.println(RadioButtonSelected);
	
	if(RadioButtonSelected== false) {
		driver.findElement(By.xpath("//input[@value='Bike']")).click();
	}
List<WebElement> RadioButtons=driver.findElements(By.name("vehicle"));
System.out.println(RadioButtons.size());
driver.close(); //result baghnya sathi cut kara
}
}
