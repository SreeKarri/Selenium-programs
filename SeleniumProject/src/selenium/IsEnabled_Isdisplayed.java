package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window();
		WebElement searchtfield =d.findElement(By.name("q"));
		//searchtfield.isDisplayed();
		if (searchtfield.isDisplayed() && searchtfield.isEnabled()) 
		{
			searchtfield.sendKeys("india");
			
		}
		
		
		List <WebElement> autosugg=d.findElements(By.xpath("//div[@class='aZjrb']/ul/li"));
	     int count =autosugg.size();
	     System.out.println(count);
	     autosugg.get(4).click();
	     
		

	}

}
