package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBI_no_rightClickoption {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://retail.onlinesbi.sbi/retail/login.htm");
		d.manage().window();
		
		WebElement login =d.findElement(By.className("login_button"));
		     	
		     login.click()	;
		WebElement un =d.findElement(By.id("username"));
		un.sendKeys("sree");
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("sr1234$");
		WebElement captch=d.findElement(By.name("loginCaptchaValue"));
		captch.sendKeys("jjkkjjj");
	}

}
