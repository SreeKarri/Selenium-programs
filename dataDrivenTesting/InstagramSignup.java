package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSignup {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("https://www.instagram.com/accounts/emailsignup/");
		FileInputStream f1 = new FileInputStream(
				"C:\\Kash\\Sree\\Automation\\eclipse-workspace\\mktjavaproject\\FolderForXlValues\\Batch41Automation.xlsx");
		
	Workbook w1 = WorkbookFactory.create(f1);
		
		WebElement email = d.findElement(By.name("emailOrPhone"));
		
		String s = w1.getSheet("InstagramSignup").getRow(1).getCell(0).getStringCellValue();
		email.sendKeys(s);
	
		WebElement name = d.findElement(By.name("fullName"));
		String s1 = w1.getSheet("InstagramSignup").getRow(1).getCell(1).getStringCellValue();
		name.sendKeys(s1);
		WebElement username = d.findElement(By.name("username"));
		String s2 = w1.getSheet("InstagramSignup").getRow(1).getCell(2).getStringCellValue();
		username.sendKeys(s2);
		WebElement pass =d.findElement(By.name("password"));
		String s3 =w1.getSheet("InstagramSignup").getRow(1).getCell(3).getStringCellValue();
		pass.sendKeys(s3);
		WebElement signup =d.findElement(By.xpath("//button[.='Sign up']"));
		signup.click();


	}

}
