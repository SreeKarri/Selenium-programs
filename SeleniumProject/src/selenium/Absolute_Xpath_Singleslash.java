package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_Singleslash {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("file:///Users/Amma/Downloads/learningHTML1.html");
		WebElement un=d.findElement(By.xpath("(/html/body/input)[1]"));
		un.sendKeys("sree");
		WebElement hint=d.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("s");


	}

}
