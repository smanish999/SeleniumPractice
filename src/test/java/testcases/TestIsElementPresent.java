package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	public static WebDriver driver;
	
	 public static boolean isElementPresent(By by)
	 {
		int sizev=driver.findElements(by).size();
				if(sizev==0)
				{
					return false;
			
				}
				else
				{
					return true;
				}
	 }

	public static void main(String[] args) {
		
		
		
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	System.out.println(isElementPresent(By.id("searchLanguage3232")));
	}

}
