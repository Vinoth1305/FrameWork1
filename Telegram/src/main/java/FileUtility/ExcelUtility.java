package FileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public static String getCellData() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/testdata.xlsx");
	
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sheet=book.getSheet("resgister");
		
		Row row=sheet.getRow(5);
		
		Cell cell=row.getCell(0);
		
		String value=cell.getStringCellValue();
		System.out.println(value);
		
		return value;
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		getCellData();
	}
}
