package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Registration {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/signup");
	WebElement un =driver.findElement(By.name("firstname"));
	un.sendKeys("jyo");
	WebElement un_las= driver.findElement(By.name("lastname"));
	un_las.sendKeys("k");
	WebElement un_em =driver.findElement(By.name("reg_email__"));
	un_em.sendKeys("jyokarri@gmail.com");
	WebElement un_re_em =driver.findElement(By.name("reg_email_confirmation__"));
	un_re_em.sendKeys("jyokarri@gmail.com");
	
    WebElement un_pas=driver.findElement(By.name("reg_passwd__"));
    un_pas.sendKeys("sno12345");

	}

}
