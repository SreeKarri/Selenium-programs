package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pharmacy_Apollo {

	public static void main(String[] args)  {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("https://www.apollopharmacy.in/");
		
		WebElement searchitem =d.findElement(By.xpath("//input[@id='searchProduct']"));
		searchitem.sendKeys("vitamins");
		WebElement vitamins =d.findElement(By.xpath("))
		
		

	}

}
