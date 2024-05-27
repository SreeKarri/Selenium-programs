package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_DropDown {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/signup");
		d.manage().window()	;
		
		WebElement month =d.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("8");
		
		WebElement day =d.findElement(By.id("day"));
		Select s2 =new Select(day);
		s2.selectByValue("12");
		
		WebElement year =d.findElement(By.id("year"));
		Select s3 =new Select (year);
		s3.selectByValue("2018");
		
		
		
		

	}

}
