package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTakeScreenShot {
	public static WebDriver driver;
	public static void TakeScreenshot() throws IOException
	{
		Date d=new Date();
		String name=(d.toString().replace(":", "_").replace(" ", "_")+".jpg");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//"+name));
	
	}

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('demo').innerHTML = Date()");
		js. executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", driver.findElement(By.xpath("/html/body/button")));
		TakeScreenshot();
	
	}

}
