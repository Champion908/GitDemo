package EXAMPLES;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestData 
{

	public  String testData(int rowIndex,int cellIndex) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\PracticeExample\\Testdata\\Book1.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		
		return value;
	}
}
