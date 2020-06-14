package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4ResizeBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Fullslider=driver.findElement(By.xpath("/html"));
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(Fullslider, 400, 400).perform();

	}

}
