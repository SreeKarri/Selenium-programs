package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_to_Create_uniquiness {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		//d.get("https://www.google.com/");
		d.manage().window();
		//WebElement e =d.findElement(By.cssSelector(".gLFyf"));
		//e.sendKeys("india");
		//e.sendKeys(Keys.ENTER);
		
		d.get("https://www.flipkart.com/");
		WebElement flisear=d.findElement(By.cssSelector(".Pke_EE"));
		flisear.sendKeys("mobile");
		flisear.sendKeys(Keys.ENTER);
	}

}
