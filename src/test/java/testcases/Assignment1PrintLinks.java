package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1PrintLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
		search.sendKeys("way2automation");
		search.sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement block=driver.findElement(By.xpath("//*[@id=\"cnt\"]/div[9]"));
	    List<WebElement> list2=block.findElements(By.tagName("a"));
	    System.out.println(list2.get(1));
	    List<WebElement> list=driver.findElements(By.tagName("a"));
	    System.out.println(list.size());
for(WebElement lst:list)
{
	System.out.println(lst.getText() +"--------"+ lst.getAttribute("href"));
}
	}

}
