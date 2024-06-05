package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gro_Reg_page {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://grotechminds.com/registration/");
		d.manage().window().maximize();
		WebElement fname =d.findElement(By.name("fname"));
		fname.sendKeys("sree");
		WebElement lname =d.findElement(By.name("lname"));
		lname.sendKeys("ka");
		WebElement email =d.findElement(By.name("email"));
		email.sendKeys("jyokarri@gmail.com");
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("se1234%");
		WebElement gender=d.findElement(By.id("Female"));
		gender.click()	;
		WebElement skill =d.findElement(By.id("Skills"));
		skill.click();
		Select s=new Select(skill);
		s.selectByVisibleText("Non-Technical Skills");
		skill.click();
		WebElement country =d.findElement(By.id("Country"));
		country.click();
		Select s1 =new Select (country);
		s1.selectByVisibleText("France ");
		WebElement preaddress =d.findElement(By.id("Present-Address"));
		preaddress.sendKeys("678 sonia , Maryland");
		WebElement paraddress =d.findElement(By.id("Permanent-Address"));
		paraddress.sendKeys("678 sonia, Maryland");
		WebElement pin =d.findElement(By.id("Pincode"));
		pin.sendKeys("21043");
		WebElement region =d.findElement(By.id("Relegion"));
		region.click();
		Select s2 =new Select (region);
		s2.selectByVisibleText("Parsis");
		region.click();
		WebElement relocate =d.findElement(By.id("relocate"));
		relocate.click();
				
		WebElement file =d.findElement(By.id("file"));
		file.sendKeys("/Users/Amma/Desktop/photo.JPG");
		
		WebElement submit =d.findElement(By.name("Submit"));
		submit.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
