package selenium.project.Project1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;

public class Amz_DDT
{
	protected String username;
	protected String pass;
	

	public void valid_cred() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\ratho\\eclipse-workspace\\SeleniumBasics\\src\\DDT\\Test.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		 username = s1.getRow(1).getCell(0).getStringCellValue();
		 pass = s1.getRow(1).getCell(1).getStringCellValue();
		
	}
	public void invalid_cred() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\ratho\\eclipse-workspace\\SeleniumBasics\\src\\DDT\\Test.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		 username = s1.getRow(2).getCell(0).getStringCellValue();
		 pass = s1.getRow(2).getCell(1).getStringCellValue();
		
	}
}
