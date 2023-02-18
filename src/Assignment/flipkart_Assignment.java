package Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_Assignment {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium\\n\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(1000);
	  driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(500);
	  driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("ipad");
	  Thread.sleep(500);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]")).click();
	Thread.sleep(1000);
	String mainp = driver.getWindowHandle();
	Set<String> newp = driver.getWindowHandles();
	Iterator i = newp.iterator();
	String mpage = (String) i.next();
	String npage = (String) i.next();
	driver.switchTo().window(npage);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("vishalkharwade93@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
	driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("9000000000");

}
}
