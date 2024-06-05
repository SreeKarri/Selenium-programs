package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationForm_GRotech {

	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		d.get("https://grotechminds.com/registeration-form/");
		d.manage().window().maximize();
		WebElement fstname = d.findElement(By.id("firstName"));
		fstname.sendKeys("sree");
		WebElement lstname = d.findElement(By.id("lastName"));
		lstname.sendKeys("ka");
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys("jyokarri@gmail.com");
		WebElement phone = d.findElement(By.id("phone"));
		phone.sendKeys("7123219876");
		WebElement gender = d.findElement(By.id("gender"));
		gender.click();
		Select s = new Select(gender);
		s.selectByVisibleText("Female");
		gender.click();
		WebElement state = d.findElement(By.id("state"));
		state.click();
		Select s1 = new Select(state);
		s1.selectByVisibleText("Assam");
		state.click();
		WebElement aadhar = d.findElement(By.id("aadhaar"));
		aadhar.sendKeys("123456789012");
		WebElement pan = d.findElement(By.id("pan"));
		pan.sendKeys("ABCDE1234G");
		WebElement terms = d.findElement(By.id("terms"));
		terms.click();
		WebElement reg = d.findElement(By.name("Submit"));
		reg.click();

	}

}
