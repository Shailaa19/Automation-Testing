package classandobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classes {
	WebDriver d;
	public void open_chrome() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		
	}
	public void get_title() {
		System.out.println(d.getTitle());
	
	}
	public void get_url() {
		System.out.println(d.getCurrentUrl());
	}
	public void drop() {
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> a1=a.findElements(By.tagName("option"));
		System.out.println(a1.size());
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i).getText());
			
		}
	
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classes ca=new Classes();
		ca.open_chrome();
		ca.get_title();
		ca.get_url();
		ca.drop();
		
		

	}

}
