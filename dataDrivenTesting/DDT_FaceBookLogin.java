package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_FaceBookLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window();
		d.get("https://www.facebook.com/");
		FileInputStream f1 = new FileInputStream(
				"C:\\Kash\\Sree\\Automation\\eclipse-workspace\\mktjavaproject\\FolderForXlValues\\Batch41Automation.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		WebElement email = d.findElement(By.id("email"));
		String s = w1.getSheet("facebooklogin").getRow(1).getCell(0).getStringCellValue();
		email.sendKeys(s);
		WebElement pass = d.findElement(By.id("pass"));
		String p = w1.getSheet("facebooklogin").getRow(1).getCell(1).getStringCellValue();
		pass.sendKeys(p);
		WebElement login = d.findElement(By.name("login"));
		login.click();

		Thread.sleep(7000);
		d.close();
	}

}
