package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframe {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_dom_html_get");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.id("btn1")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
driver.switchTo().defaultContent();

List<WebElement> list=driver.findElements(By.tagName("iframe"));
System.out.println(list.size());
for(WebElement abc:list )
{
	System.out.println(abc.getAttribute("id"));
	
}

	}

}
