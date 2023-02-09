package EXAMPLES;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample extends TestData 
{

	  static WebDriver driver;
			public static void main(String[] args) throws InterruptedException, IOException 
			{
			
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
				driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjc0NDYzNDAxLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
				Thread.sleep(5000);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
				Thread.sleep(5000);
				TestData S1 = new TestData();
				
				
				
				
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys());
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(TestData.testData(0, 1));
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("admin123");
				Thread.sleep(5000);
				WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
				Select S = new Select(day);
				S.selectByIndex(4);
				Thread.sleep(5000);
				
				
				
				}
			
			
			
			
	
}
