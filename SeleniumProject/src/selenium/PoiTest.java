package selenium;

//Java Program to Illustrate Reading 
//Data to Excel File Using Apache POI 

//Import statements 
import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet; 
import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.FormulaEvaluator; 
import org.apache.poi.ss.usermodel.Row; 

//Main class 
public class PoiTest {  

	// Main driver method 
	public static void main(String[] args) 
	{ 

		// Try block to check for exceptions 
		try { 

			// Reading file from local directory 
			FileInputStream file = new FileInputStream( 
				new File("/Users/Amma/eclipse-workspace/SeleniumProject/src/selenium/Sree_batch_109MKT.xlsx")); 

			// Create Workbook instance holding reference to 
			// .xlsx file 
			HSSFWorkbook workbook = new HSSFWorkbook(file); 

			// Get first/desired sheet from the workbook 
			HSSFSheet sheet = workbook.getSheetAt(0); 

			// Iterate through each rows one by one 
			Iterator<Row> rowIterator = sheet.iterator(); 

			// Till there is an element condition holds true 
			while (rowIterator.hasNext()) { 

				Row row = rowIterator.next(); 

				// For each row, iterate through all the 
				// columns 
				Iterator<Cell> cellIterator 
					= row.cellIterator(); 

				while (cellIterator.hasNext()) { 

					Cell cell = cellIterator.next();
					
					System.out.print(cell.getStringCellValue() + "t");


				} 

				System.out.println(""); 
			} 

			// Closing file output streams 
			file.close(); 
		} 

		// Catch block to handle exceptions 
		catch (Exception e) { 

			// Display the exception along with line number 
			// using printStackTrace() method 
			e.printStackTrace(); 
		} 
	} 
}
