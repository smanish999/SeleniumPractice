package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3HandleCaptcha {
public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String abc=driver.findElement(By.id("mathq2")).getText();
String a=abc.substring(0, 1);
String b=abc.substring(2, 3);
String c=abc.substring(4, 5);
System.out.println("Value of A: " + a);
//System.out.println(b);
System.out.println("Value of B: " +c);
int Value_A=Integer.parseInt(a);

int Value_C=Integer.parseInt(c);
System.out.println(Value_A);

System.out.println(Value_C);

if(b.equalsIgnoreCase("+"))
{
	int sum=Value_A+Value_C;
	System.out.println("A+B="+sum);
}
else if(b.equalsIgnoreCase("-"))
		{
	int sum=Value_A-Value_C;
	System.out.println("A-B="+sum);
		}


	}

}
