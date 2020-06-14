package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static void main(String[] args) {
		
		/*
		 
		//CTRL+SHIFT+O is the shortcut
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_NewSeries2020\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.get("http://way2automation.com");
		*/
		
		
		
 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		/*
		System.setProperty("webdriver.ie.driver", "D:\\Selenium_NewSeries2020\\Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("http://way2automation.com");
		*/
		
		/*
		System.setProperty("webdriver.edge.driver", "D:\\Selenium_NewSeries2020\\Drivers\\MicrosoftWebDriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://way2automation.com");
		*/
		/*
		System.setProperty("webdriver.opera.driver", "D:\\Selenium_NewSeries2020\\Drivers\\operadriver.exe");
		OperaDriver driver=new OperaDriver();
		driver.get("http://way2automation.com");
		*/
		
		
		
	}

}
