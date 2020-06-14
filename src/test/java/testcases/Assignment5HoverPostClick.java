package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5HoverPostClick {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ContextRight=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/div[2]/table[1]/tbody/tr/td[3]/p[2]/img"));
		
		Actions action=new Actions(driver);
		action.contextClick(ContextRight).perform();
		WebElement HoverProductInfor=driver.findElement(By.id("dm2m1i1tdT"));
		
		action.moveToElement(HoverProductInfor).perform();
		
		WebElement HoverOnInstallation=driver.findElement(By.id("dm2m2i1tdT"));
		action.moveToElement(HoverOnInstallation).perform();
		driver.findElement(By.id("dm2m3i1tdT")).click();
	}

}
