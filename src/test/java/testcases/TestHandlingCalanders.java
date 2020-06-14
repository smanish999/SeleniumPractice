package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestHandlingCalanders {
	static int targetDay= 0,
			targetMonth=0,
			targetYear=0;
	
	static int currentDay=0,
			currentMonth=0,
			currentYear=0;
	static int jumpMonthsBy=0;
	
	static boolean increment=true;
			

	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		
		/*
		 * Target day, month, year
		 * current day, month,year
		 * jump to the month
		 * increment to decrement
		 * 
		 * 
		 */
		String dateToSet="16/08/2015";
		getCurrentDateMonthAndYear();
		//Get current date
		System.out.println(currentDay);
		System.out.println(currentMonth);
		System.out.println(currentYear);
		
	
		
		//Get the targer date
		
		getTargetDateMonthYear(dateToSet);
		System.out.println(targetDay +"   "+targetMonth+"     "+targetYear );
		
		//Get JumpMonth
		CalculateHowManyMonthToJUmp();
		System.out.println(jumpMonthsBy );
		System.out.println(increment);
		
		
		WebDriverManager.firefoxdriver().setup();
	    driver=new FirefoxDriver();
		driver.get("http://way2automation.com/way2auto_jquery/datepicker.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Signin")).click();
		WebDriverWait wait=new WebDriverWait(driver,50);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input"))).sendKeys("rummydummy1234");
		/*Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input")).sendKeys("rummydummy");
		action.sendKeys(Keys.TAB).build().perform();
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[2]/input")).sendKeys("123456");
		*/
	driver.findElement(By.name("//*[@id=\"load_form\"]/div/div[2]/input")).click();
		driver.get("http://way2automation.com/way2auto_jquery/datepicker.php");
		
		driver.findElement(By.name("//*[@id=\"datepicker\"]")).click();
		
		for(int i=0;i<jumpMonthsBy;i++)
		{
			if(increment)
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]")).click();
			}
		}
		
	}
	
	public static void getCurrentDateMonthAndYear()
	{
		Calendar cal=Calendar.getInstance();
		currentDay=cal.get(Calendar.DAY_OF_MONTH);
				currentMonth=cal.get(Calendar.MONTH)+1;
				currentYear=cal.get(Calendar.YEAR);
	}
	
	public static void getTargetDateMonthYear(String dateString)
	{
		int firstIndex=dateString.indexOf("/");
		int lastInder=dateString.lastIndexOf("/");
		
		String day=dateString.substring(0,firstIndex);
		targetDay= Integer.parseInt(day);
		
		String month=dateString.substring(firstIndex+1,lastInder);
		targetMonth=Integer.parseInt(month);
		
		String year=dateString.substring(lastInder+1,dateString.length());
		targetYear=Integer.parseInt(year);
	}
	
 public static void CalculateHowManyMonthToJUmp()
 {
	 if((targetMonth-currentMonth)>0)
	 {
		 jumpMonthsBy=(targetMonth-currentMonth);
	 }else
	 {
		 jumpMonthsBy=(currentMonth-targetMonth);
		 increment =false;
	 }
 }
}
