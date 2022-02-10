package ratna;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot sh=(TakesScreenshot) driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File des=new File("C://personal//Section3//Screenshot//sc.jpg");
	}
}
