package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("http://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("books");
		Thread.sleep(2000);
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("harrypotter");
	
		d.findElement(By.id("nav-search-submit-button")).click();
		
		boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		boolean displayed=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(displayed);
		boolean enabled=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(enabled);
		
				
				
	
		
		

	}

}
