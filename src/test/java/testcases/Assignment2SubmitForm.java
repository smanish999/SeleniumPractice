package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2SubmitForm {
 public static WebDriver driver;
	public static void main(String[] args) {
		//Navigate to qa.way2automation.com and on the registration form Enter name and click on submit. Dont use absolute/partial xpath.
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("http://qa.way2automation.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("name")).sendKeys("Manish");
       driver.findElement(By.xpath("//div[@id='load_box']/form[@id='load_form']/div/div//input[@type='submit']")).click();
        
      
	}

}
