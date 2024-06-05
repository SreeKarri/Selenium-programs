package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechminds_hoverOver {

	public static void main(String[] args) {
	ChromeDriver d= new ChromeDriver();
	d.manage().window();
	d.get("https://grotechminds.com/hoverover/");
	//WebElement Demo1 = d.findElement(By.xpath("(//div[@class='toolrip4'][1])"));
    Actions a =new Actions (d);
	//a.moveToElement(Demo1).perform();
	//WebElement Dp3 =d.findElement(By.xpath("(//div[@class='popup4'][1])"));
	//Dp3.click();
	
  WebElement Demo2 = d.findElement(By.xpath("(//div[@class='toolrip4'])"));
    
	a.moveToElement(Demo2).perform();
	WebElement Dp6 =d.findElement(By.xpath("(//div[@class='popup4'])"));
	Dp6.click();
	
	}

}
