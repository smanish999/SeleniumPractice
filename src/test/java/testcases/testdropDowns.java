package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testdropDowns {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("REGISTER")).click();
		//driver.findElement(By.name("country")).sendKeys("India");
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		Select select=new Select(dropdown);
		select.selectByValue("hi");
		WebElement blck=driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
		List<WebElement> values = blck.findElements(By.tagName("a"));
		System.out.println(values.size());
		
		/*System.out.println(values.size());
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("href"));
		}
		*/
		
		
		
		
		for(WebElement Abc:values)
		{
			System.out.println(Abc.getText()+ " Links"+Abc.getAttribute("href"));
		}
		
		/*
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i).getAttribute("lang"));
		}
		*/
		
		

	}

}
