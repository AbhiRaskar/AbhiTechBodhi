package CheckBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxExample {
	public static void main(String[] args) {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://omayo.blogspot.com");

	List<WebElement> totalcheckbox = driver.findElements(By.name("accessories"));
	
	for(int i=0;i<=totalcheckbox.size()-1;i++) {
		
		System.out.println(totalcheckbox.get(i).getAttribute("value"));
		totalcheckbox.get(i).click();
	}
	}
}