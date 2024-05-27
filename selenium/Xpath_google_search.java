package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_google_search {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("https://www.google.com/");
		WebElement searchfield= d.findElement(By.xpath("(//textarea)[1])"));
		searchfield.sendKeys("india");
		searchfield.sendKeys(Keys.ENTER);


	}

}
