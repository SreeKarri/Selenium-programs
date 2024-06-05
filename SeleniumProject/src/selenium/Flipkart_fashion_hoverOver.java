package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Flipkart_fashion_hoverOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement fas =driver.findElement(By.cssSelector("._1wE2Px"));
		a.moveToElement(fas).perform();
		
		WebElement m_tshirt =driver.findElement(By.cssSelector("._3490ry"));
		a.moveToElement(m_tshirt).perform();
		m_tshirt.click();
		
	}

}
