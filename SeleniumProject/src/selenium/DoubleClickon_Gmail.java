package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickon_Gmail {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window();
		WebElement gmail =d.findElement(By.linkText("Gmail"));
		Actions a1 =new Actions(d);
		//gmail.click();
		    a1.doubleClick(gmail).perform();
	}

}
