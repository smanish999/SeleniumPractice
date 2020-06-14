package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/group");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> Rows=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));   
		List<WebElement> coulmn=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println(Rows.size());
		System.out.println(coulmn.size());

		for(int row=1;row<=Rows.size();row++)
		{
			for(int coul=1;coul<=coulmn.size();coul++)
			{
				System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td["+coul+"]")).getText()+"   ");
				
			}
			
			System.out.println();
			
		}
		
		
	}

}
