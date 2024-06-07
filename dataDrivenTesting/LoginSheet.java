package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Kash\\Sree\\Automation\\eclipse-workspace\\mktjavaproject\\src\\dataDrivenTesting\\New Microsoft Excel Worksheet.xlsx");
		Workbook wb = WorkbookFactory.create(f1);

		Sheet s1 = wb.getSheet("Sheet1");
		Row r1 = s1.getRow(0);
		Cell c1 = r1.getCell(0);
		String value1 = c1.getStringCellValue();
		System.out.println(value1);

	}

}
