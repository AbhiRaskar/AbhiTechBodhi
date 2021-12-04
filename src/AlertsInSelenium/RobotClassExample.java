package AlertsInSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RobotClassExample {
	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		//specify the file location
		StringSelection sel =new StringSelection("C:\\Users\\dell\\Downloads//Abhishek_Raskar_Resume");
		//copy to clipboard
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	//open naukri.com
		driver.get("https://www.naukri.com/account/register/basicdetails");
		Thread.sleep(5000);
	//click on upload resume button
			driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
	Thread.sleep(1000);
		Robot robot = new Robot();
	//press enter
	robot.keyPress(KeyEvent.VK_ENTER);
		//release enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		//press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		//release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		//PRESS ENTER
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	
	}
}
