package browserInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserInvoke {
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.co.in");
}
}