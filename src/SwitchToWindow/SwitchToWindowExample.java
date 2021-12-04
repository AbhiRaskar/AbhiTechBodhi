package SwitchToWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SwitchToWindowExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");

		driver.findElement(By.id("win1")).click();
		//Get handles of windows
		String mainwindowhandle = driver.getWindowHandle();
		String mainWindowHandle = null;
		System.out.println(mainWindowHandle);
		Set<String>allWindowhandles = driver.getWindowHandles();
		Set<String> allWindowHandles = null;
		System.out.println(allWindowHandles);
		Iterator<String> iterator = allWindowHandles.iterator();
		while(iterator.hasNext())
		{
			String child_window=iterator.next();
			if(!mainWindowHandle.equals(child_window)) 
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
				}
			//switch to parent window
			driver.switchTo().window(mainWindowHandle);
			Thread.sleep(2000);
			driver.findElement(By.id("seden-checkbox")).click();
			System.out.println();driver.getTitle();
			
		}
		}
}
