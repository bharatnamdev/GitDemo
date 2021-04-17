package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {	
public static void main(String[] agrs)
    {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shikha\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	}
}
