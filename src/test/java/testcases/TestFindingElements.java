package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindingElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement username =driver.findElement(By.id("identifierId"));
		username.sendKeys("kmanish999@gmail.com ");
	driver.findElement(By.id("identifierNext")).click();
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Learn more"))).click();
	Wait<WebDriver> wait2=new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS); 
	
	
		
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close(); 

	}

}
