package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMAIL_Linktext_Locator {

	public static void main(String[] args) {
		/*ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("https://www.google.com/");
		WebElement gmail=d.findElement(By.linkText("Gmail"));
		gmail.click();
		WebElement signin =d.findElement(By.linkText("Sign in"));
		signin.click()	;*/
		ChromeDriver d=new ChromeDriver();
		d.get("https:/www.amazon.com");
	    d.manage().window();
	    WebElement pltext=d.findElement(By.partialLinkText("Best"));
	    pltext.click();
		
		

	}

}
