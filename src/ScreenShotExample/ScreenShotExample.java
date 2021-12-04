package ScreenShotExample;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScreenShotExample {
	public static <File> void main(String[] args) throws InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\Tech bodhi\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(3000);
			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
TakesScreenshot scrshot =((TakesScreenshot)driver);
java.io.File cpFile =scrshot.getScreenshotAs(OutputType.FILE);
//take current date and time
SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
Date date = new Date();
String abc =formatter.format(date).toString().replace("/","");
String exactpathfilename=abc.replace(" ","").replace(":","");
System.out.println(exactpathfilename);

String CapturePath ="C:\\Users\\dell\\Desktop\\TechBodhi Abhi\\"+exactpathfilename+".png";
		try
		{//save the screenshot taken in destination path 
			FileUtils.copyFile(cpFile, new java.io.File(CapturePath));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
		}

}
