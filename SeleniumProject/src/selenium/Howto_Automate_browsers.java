package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howto_Automate_browsers {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
String title	=driver.getTitle();
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.findElement(By.name("btnk")).click();
	// driver.get("https://www.Amazon.com");
	// driver.findElement(By.name("field-keywords")).sendKeys("pooltoys");
	// driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
	 //driver.get("https://www.meesho.com");
	// driver.findElement(By.name("))
	}

}
