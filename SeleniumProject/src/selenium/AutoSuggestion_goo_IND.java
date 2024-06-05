package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_goo_IND {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window();
		WebElement searchtfield =d.findElement(By.name("q"));
		
		
			searchtfield.sendKeys("india");
			Thread.sleep(2000);
		
		
		
		List <WebElement> autosugg=d.findElements(By.xpath("//div[@class='aZjrb']/ul/li"));
	     int count =autosugg.size();
	     System.out.println(count);
	     autosugg.get(4).click();

	}

}
