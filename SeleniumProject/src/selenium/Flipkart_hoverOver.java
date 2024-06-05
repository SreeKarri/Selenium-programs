package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverOver {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement login =driver.findElement(By.xpath("(//a[.='Login'])"));
	Actions  a1 =new Actions(driver);
	a1.moveToElement(login).perform();
	login.click();
	WebElement otp =driver.findElement(By.xpath("(//button[.='Request OTP'])"));
	otp.click()	;
	
	
	}

}
