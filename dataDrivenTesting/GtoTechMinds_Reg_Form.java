package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GtoTechMinds_Reg_Form {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	ChromeDriver d =new ChromeDriver();
	d.manage().window();
	d.get("https://grotechminds.com/registeration-form/");
	
	FileInputStream f1=new FileInputStream("C:\\Kash\\Sree\\Automation\\eclipse-workspace\\mktjavaproject\\FolderForXlValues\\Batch41Automation.xlsx");
	            Workbook wb  = WorkbookFactory.create(f1);
	    WebElement firstname =d.findElement(By.id("firstName"));
	    String s = wb.getSheet("GroTechMindsRegistration").getRow(1).getCell(0).getStringCellValue();
	    firstname.sendKeys(s);
	    WebElement lastname =d.findElement(By.id("lastName"));
	    String s1=wb.getSheet("GroTechMindsRegistration").getRow(1).getCell(1).getStringCellValue();
	    lastname.sendKeys(s1);
	    WebElement email =d.findElement(By.id("email"));
	    String s2=wb.getSheet("GroTechMindsRegistration").getRow(1).getCell(2).getStringCellValue();
	    email.sendKeys(s2);
	    WebElement phno =d.findElement(By.id("phone"));
	    String s3=NumberToTextConverter.toText (wb.getSheet("GroTechMindsRegistration").getRow(1).getCell(3).getNumericCellValue());
	    phno.sendKeys(s3);
	    WebElement gender =d.findElement(By.id("gender"));
	    gender.click();
	    Select g=new Select(gender);
	    g.selectByVisibleText("Female");
	    gender.click();
	    WebElement state =d.findElement(By.id("state"));
	    state.click();
	    Select stat =new Select (state);
	    stat.selectByVisibleText("Assam");
	    state.click();
	    WebElement aadhar =d.findElement(By.id("aadhaar"));
	    String s4=NumberToTextConverter.toText(wb.getSheet("GroTechMindsRegistration").getRow(1).getCell(6).getNumericCellValue());
	    aadhar.sendKeys(s4);
	    WebElement pan =d.findElement(By.id("pan"));
	    String s5=wb.getSheet("GroTechMindsRegistration").getRow(1).getCell(7).getStringCellValue();
	    pan.sendKeys(s5);
	    WebElement terms = d.findElement(By.id("terms"));
	    terms.click();
	    WebElement submit =d.findElement(By.name("Submit"));
	    submit.click();
	    
	    Thread.sleep(5000);
		d.close();
	    
	    
	    
	    
	    
	    
	    
	            

	}

}
