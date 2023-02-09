package EXAMPLES;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Listbox 
{

		static WebDriver driver;
		
		
public static void main(String[] args) throws InterruptedException, IOException, EncryptedDocumentException 
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(5000);
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\PracticeExample\\Testdata\\Book1.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
			String UN = sh.getRow(1).getCell(0).getStringCellValue();
			String PW = sh.getRow(1).getCell(1).getStringCellValue();
			
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PW);
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			}
		
		
		
		
		
		

}
