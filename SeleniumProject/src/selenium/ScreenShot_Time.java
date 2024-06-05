package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Time {

	public static void main(String[] args) throws IOException {

		ChromeDriver d = new ChromeDriver();
		d.manage().window();
		d.get("https://www.google.com/");
		WebElement searchind = d.findElement(By.cssSelector("textarea#APjFqb"));
		searchind.sendKeys("Maryland");
		searchind.sendKeys(Keys.ENTER);
		
		Date d1 = new Date();// getTime(); //method
		System.out.println("Machine time: " + d1.getTime()); // Machine time
		Date d2 = new Date(d1.getTime());
		System.out.println("Human understadable current time: " + d2);
		String d3 = d2.toString();

		TakesScreenshot a1 = d;
		File source = a1.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/Amma/Desktop/Sel_MKT/" + Math.random() + d3 + "screenshot.png" );
		//File destination = new File("/Users/Amma/C;/Sel_MKT/" + Math.random() + d3 + "screenshot.png" );
		FileHandler.copy(source, destination);//file from file to
		

	}

}
