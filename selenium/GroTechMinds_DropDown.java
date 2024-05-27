package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMinds_DropDown {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://grotechminds.com/dropdown/");
		
		d.manage().window();
		WebElement e1=d.findElement(By.id("Choice1"));
		Select s= new Select(e1);
		s.selectByVisibleText("Demo2");
		
		WebElement e2=d.findElement(By.id("Choice9"));
		Select s2= new Select(e2);
		s2.selectByValue("SQL15");
		
		WebElement e3=d.findElement(By.id("Choice6"));
		Select s3= new Select(e3);
		s3.selectByValue("Night10");
		
		WebElement e4=d.findElement(By.id("Choice8"));
		Select s4= new Select(e4);
		s4.selectByVisibleText("QTP10");
		
		WebElement e5=d.findElement(By.id("Choice8"));
		Select s5= new Select(e5);
		s5.selectByVisibleText("QTP6");
		
		WebElement e6=d.findElement(By.id("Choice8"));
		Select s6= new Select(e6);
		s6.selectByVisibleText("QTP9");
		
		WebElement e7=d.findElement(By.id("Choice8"));
		Select s7= new Select(e7);
		s7.selectByVisibleText("QTP8");
		
		
		
		
		
		
				
	}

}
