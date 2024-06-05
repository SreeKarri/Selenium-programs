package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_grotechminds {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d= new ChromeDriver();
		d.get("https://grotechminds.com/drag-and-drop/");
		d.manage().window();
		
		
        Actions a=new Actions(d);
      
        WebElement drageclips= d.findElement(By.xpath("(//div[@id='container']/span/div)[4]"));
        WebElement dropeclips =d.findElement(By.xpath("//div[@class='w3-container'][2])"));
        a.dragAndDrop(drageclips, dropeclips);
        Thread.sleep(2000);
        a.dragAndDrop(dropeclips ,drageclips);
       // WebElement dragback= d.findElement(By.xpath("(//div[@id='div2'])"));
       // WebElement drop2 =d.findElement(By.xpath("(//img[@id='drag11'])"));
        //a.dragAndDrop(dragback, drop2);
        
        
        
	}

}
