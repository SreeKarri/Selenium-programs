package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Walmart_hoverOver {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.walmart.com/store/2412-ellicott-city-md");
		d.manage().window();
		WebElement signAccount =d.findElement(By.xpath("(//div[@class='b lh-copy h2 f5 '])"));
		Actions a1 =new Actions(d);
		a1.moveToElement(signAccount).perform()	;
		WebElement sigin=d.findElement(By.xpath("(//button[.='Sign in or create account'])"));
		sigin.click();
		

	}

}
