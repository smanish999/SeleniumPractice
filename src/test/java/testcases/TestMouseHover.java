package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseHover {
	 public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.name("q")).sendKeys("way2automation");
WebDriverWait wait=new WebDriverWait(driver,5);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]"))).click();
driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/a/h3")).click();


WebElement menu=driver.findElement(By.xpath("/html/body/div[4]/div/header/div[3]/div/nav/div[2]/ul/li[8]/a"));;


Actions action=new Actions(driver);

action.moveToElement(menu).build().perform();

driver.findElement(By.linkText("Practice site 1")).click();

		
		
        

	}

}
