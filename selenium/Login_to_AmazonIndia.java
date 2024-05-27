package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Login_to_AmazonIndia {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fstores%2Fpage%2FFB61ADA2-F77A-413C-97C9-BB74C754829D%3Fchannel%3DSearch_store_AMZ%26gad_source%3D1%26gclid%3DCjwKCAjwr7ayBhAPEiwA6EIGxJXnA7AlrJ-l3kzbU8SAuSxQ5wWnF9hJrYxs62TV73xTApV9cU7vxRoCWrEQAvD_BwE%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    // driver.get("https://www.amazon.in");
	WebElement un  =driver.findElement(By.id("ap_email"));
     un.sendKeys("kash9k@gmail.com");
     WebElement un_continue =driver.findElement(By.id("continue"));
     un_continue.click();	}
	
	

}
