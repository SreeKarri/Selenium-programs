package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JASAM_REGISTRATION {  //Relative x-path syntax://tagName[@AN='AV']

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("file:///Users/Amma/Downloads/learningHTML1.html");
		WebElement un =d.findElement(By.xpath("//input[@id='1']"));
		un.sendKeys("Sree");
		WebElement hint =d.findElement(By.xpath("//input[@id='2']"));
		hint.sendKeys("karri");
		WebElement pass=d.findElement(By.xpath("//input[@id='3']"));
		pass.sendKeys("Ven1234");
		WebElement fn=d.findElement(By.xpath("//input[@name='fname']"));
		fn.sendKeys("Sree");
		WebElement boy =d.findElement(By.xpath("//input[@type='checkbox']"));
		boy.click()	;
		WebElement girl =d.findElement(By.xpath("//input[@id='121']"));
		girl.click();
		WebElement baby =d.findElement(By.xpath("//input[@id='321']"));
		baby.click();
		WebElement radio=d.findElement(By.xpath("//input[@type='radio']"));
		radio.click()	;
		WebElement checkbox=d.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click()	;
		WebElement signup=d.findElement(By.xpath("//input[@type='button']"));
		signup.click();
		
				
		
		
		
		
		
		
				
		

	}

}
