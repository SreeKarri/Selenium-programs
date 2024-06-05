package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOT {

	public static void main(String[] args) throws IOException {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("https://www.google.com/");
		WebElement searchind =d.findElement(By.cssSelector("textarea#APjFqb"));
		searchind.sendKeys("India");
		searchind.sendKeys(Keys.ENTER);
        TakesScreenshot a1 =d;
        File source =a1.getScreenshotAs(OutputType.FILE);
        File destination =new File("/Users/Amma/Desktop/Sel_MKT/" +Math.random()+"india.png");
        FileHandler.copy(source, destination);
	}

}
