package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gro_Hoverove_Demo4 {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.manage().window();
		d.get("https://grotechminds.com/hoverover/");
		//WebElement Demo4 = d.findElement(By.xpath("(//div[@class='toolrip6'])"));
	    Actions a =new Actions (d);
		//a.moveToElement(Demo4).perform();
	//WebElement Dp10 =d.findElement(By.xpath("(//div[@class='popup6'])"));
		//Dp10.click();
	    
	    
	  WebElement Demo5 = d.findElement(By.xpath("(//div[@class='toolrip7'])"));
	    
		a.moveToElement(Demo5).perform();
	WebElement Dp10 =d.findElement(By.xpath("(//div[@class='popup7'])"));
		Dp10.click();
	}
	

}
