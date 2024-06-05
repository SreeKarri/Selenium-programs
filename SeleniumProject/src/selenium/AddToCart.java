package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver d=new ChromeDriver();
	d.manage().window();
	d.get("https://www.flipkart.com/");
	WebElement search =d.findElement(By.name("q"));
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	WebElement shoe =d.findElement(By.xpath("//div[@class='wvIX4U'][1]"));
	shoe.click();
	Set<String>  s1     = d.getWindowHandles(); //to get all tab's id
	System.out.println(s1);
	Iterator<String>  pareChild   = s1.iterator(); // to get each tab id
            String childid    = pareChild.next();
            String parentid =pareChild.next();
            System.out.println(childid);
            System.out.println(parentid);
            
           // d.close();
           
            d.switchTo().window(childid);//it switch the control from parent to child
            Thread.sleep(2000);
            d.close();
            WebElement buynow =d.findElement(By.cssSelector("span.OGrnIL"));
            buynow.click();
            		
	                
	
	

	}

}
