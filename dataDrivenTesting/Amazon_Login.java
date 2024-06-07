package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		FileInputStream f = new FileInputStream(
				"C:\\Kash\\Sree\\Automation\\eclipse-workspace\\mktjavaproject\\FolderForXlValues\\Batch41Automation.xlsx");
		Workbook w1 = WorkbookFactory.create(f);
		WebElement signin = driver.findElement(By.className("nav-action-inner"));
		signin.click();
		WebElement email = driver.findElement(By.name("email"));
		String s = w1.getSheet("AmazonLogin").getRow(1).getCell(0).getStringCellValue();
		email.sendKeys(s);
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
		WebElement pass = driver.findElement(By.name("password"));
		String s1 = w1.getSheet("AmazonLogin").getRow(1).getCell(1).getStringCellValue();
		pass.sendKeys(s1);
		WebElement signin1 = driver.findElement(By.id("signInSubmit"));
		signin1.click();

	}

}
