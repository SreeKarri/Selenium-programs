package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CVS_IsEnabled_displayed {  //auto suggestion

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.cvs.com/");
		d.manage().window();
		WebElement searchtextfield  = d.findElement(By.xpath("(//input[@class='sc-cvs-search-box'])"));
		if(searchtextfield.isDisplayed() && searchtextfield.isEnabled());
		{
			searchtextfield.sendKeys("vitamin");
			
		}
		searchtextfield.click();
	}

}
