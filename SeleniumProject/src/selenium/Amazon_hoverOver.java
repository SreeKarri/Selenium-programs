package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_hoverOver {

	public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	d.get("https://www.amazon.com/");
	d.manage().window();
	WebElement AccountandList =d.findElement(By.xpath("(//span[@class='nav-line-2 '])"));
	Actions a1 =new Actions(d);
	a1.moveToElement(AccountandList).perform()	;
	WebElement sigin=d.findElement(By.xpath("(//span[.='signin'])"));
	sigin.click();
	
	

	}

}
