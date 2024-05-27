package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Registration {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https://www.amazon.com/?_encoding=UTF8&ref_=nav_newcust&openid.identity=http://specs.openid.net/auth/2.0/identifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http://specs.openid.net/auth/2.0/identifier_select&openid.ns=http://specs.openid.net/auth/2.0  ");
		//driver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//WebElement A_reg =driver.findElement(By.id("createAccountSubmit"));
		//A_reg.click();
		WebElement un =driver.findElement(By.name("customerName"));
		un.sendKeys("jyokarr");
		WebElement un_e =driver.findElement(By.name("email"));
		un_e.sendKeys("jyokarri@gmail.com");
		WebElement un_p =driver.findElement(By.name("password"));
		un_p.sendKeys("nhy13%*");
		WebElement un_reP =driver.findElement(By.name("passwordCheck"));
		un_reP.sendKeys("nhy13%*");
		WebElement un_c =driver.findElement(By.id("continue"));
		un_c.click();
				
	
		
	

	}

}
