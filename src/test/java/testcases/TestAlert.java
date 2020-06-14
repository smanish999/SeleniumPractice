package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlert {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
	
		//1st Way
		/*Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		*/
		
		//2nd Way
		WebDriverWait wait=new WebDriverWait(driver,5);
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		//This is check in test
	}

}
