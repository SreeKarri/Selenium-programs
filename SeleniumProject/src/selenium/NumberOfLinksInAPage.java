package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfLinksInAPage {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.manage().window();
		d.get("https://www.google.com/");
	List<WebElement> links=d.findElements(By.tagName("a"));
	  int count  =links.size(); // list or collection have 'size();method
	  System.out.println(count);
	  for(int i=0;i<count;i++) {
		WebElement w =  links.get(i);
		     String s1  =     w.getAttribute("href"); //give  attribute value
		String s2= w.getText();  //give linkText value of all links
		     System.out.println(s1);
		     System.out.println(s2);
		     
	  }

	}

}
