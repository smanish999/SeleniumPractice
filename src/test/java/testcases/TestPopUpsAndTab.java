package testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPopUpsAndTab {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> windsi=driver.getWindowHandles();
		Iterator<String> iterator=windsi.iterator();
		String FirstWindown=iterator.next();
		System.out.println(FirstWindown);
		
		driver.findElement(By.linkText("Click Here")).click();
		windsi=driver.getWindowHandles();
		iterator=windsi.iterator();
		iterator.next();
		String FirstWindown2=iterator.next();
		System.out.println(FirstWindown2);
		driver.switchTo().window(FirstWindown2);
		//Page2
		driver.findElement(By.name("emailid")).sendKeys("RakaBaga@gmail.com");
		driver.close();
		driver.switchTo().window(FirstWindown);
		driver.close();
	}

}
