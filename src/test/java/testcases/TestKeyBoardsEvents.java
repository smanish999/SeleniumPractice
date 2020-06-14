package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyBoardsEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("RakaBaga@gmail.com");
		
		//action.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);//alternate way
		//To combine two keys
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.chord(Keys.TAB)).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.CONTROL+"a").build().perform();
		action.sendKeys(Keys.CONTROL+"c").build().perform();
		action.sendKeys(Keys.chord(Keys.END)).build().perform();
		
		action.sendKeys(Keys.CONTROL+"v").build().perform();
	}

}
