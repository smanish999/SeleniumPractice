package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSlider {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement Fullslider=driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		WebElement Slider=driver.findElement(By.xpath("/html/body/div/span"));
int abc=Fullslider.getSize().width/2;
		
		Actions action=new Actions(driver);
		action.dragAndDropBy(Slider, abc, 0).perform();
	}

}
