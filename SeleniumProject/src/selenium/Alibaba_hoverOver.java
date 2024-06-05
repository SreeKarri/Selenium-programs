package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alibaba_hoverOver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.alibaba.com/");
		driver.manage().window().maximize();
		
		WebElement signup1 =driver.findElement(By.className("tnh-button tnh-sign-up"));
		Actions  a1 =new Actions(driver);
		a1.moveToElement(signup1).perform();
		 signup1.click()	;
		
		

	}

}
