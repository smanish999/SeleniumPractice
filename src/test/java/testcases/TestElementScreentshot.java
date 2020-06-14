package testcases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestElementScreentshot {
	public static WebDriver driver;
	public static void TakeScreenshot() throws IOException
	{
		Date d=new Date();
		String name=(d.toString().replace(":", "_").replace(" ", "_")+".jpg");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//"+name));
	
	}
	
	public static void CaptureElemetScreenshot(WebElement ele) throws IOException
	{
		Date d=new Date();
		String name=(d.toString().replace(":", "_").replace(" ", "_")+".jpg");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullimg=ImageIO.read(screenshot);
		Point point=ele.getLocation();
		int eleWidth=ele.getSize().getWidth();
		int eleHeight=ele.getSize().getHeight();
		BufferedImage slecsdc=fullimg.getSubimage(point.x, point.y, eleWidth, eleHeight);
		ImageIO.write(slecsdc, "jpg", screenshot);
		//File screenshotLocation=new File(".//screenshot//google");
		FileUtils.copyFile(screenshot, new File(".//screenshot//google"+name));
	}

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.id("hplogo"));
		CaptureElemetScreenshot(ele);
	}

}
