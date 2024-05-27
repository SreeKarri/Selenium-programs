package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_bySelect {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.amazon.com/");
		
		d.manage().window();
		WebElement e1=d.findElement(By.id("searchDropdownBox"));
		
		
				
				Select s=new Select(e1);
				
				//s.selectByVisibleText("Amazon Warehouse");
				//s.selectByValue("search-alias=warehouse-deals");	
				s.selectByIndex(2);
				
				

	}

}
