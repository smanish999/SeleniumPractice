package testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment6_NaukriHandlesWindows {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> windsi=driver.getWindowHandles();
		Iterator<String> iterator=windsi.iterator();
		String FirstWindown=iterator.next();
		System.out.println(FirstWindown);
		
		windsi=driver.getWindowHandles();
		iterator=windsi.iterator();
		iterator.next();
		String FirstWindown2=iterator.next();
		System.out.println(FirstWindown2);
		driver.switchTo().window(FirstWindown2);
		System.out.println(driver.getTitle());
		
		driver.close();
		driver.switchTo().window(FirstWindown);
		driver.close();
		
	}

}
