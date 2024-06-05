package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToWishList_AddtoCArt {

	public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	d.manage().window();
	d.get("https://www.amazon.com/");
	WebElement searchitem =d.findElement(By.cssSelector("#twotabsearchtextbox"));
	searchitem.sendKeys("shoe");
	searchitem.sendKeys(Keys.ENTER);
	WebElement firstshoe =d.findElement(By.cssSelector("#r18uz0sfiy4u8p2hzauf6200wt4"));
	firstshoe.sendKeys(Keys.ENTER);
	WebElement addtolist =d.findElement(By.xpath("a[.='Add to List']"));
	addtolist.click();
	
	
	
	
	
	
	

	}

}
